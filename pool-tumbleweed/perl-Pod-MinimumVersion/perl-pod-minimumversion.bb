SUMMARY = "Perl version for POD directives used"
DESCRIPTION = "'Pod::MinimumVersion' parses the POD in a Perl script, module, or document, \
and reports what version of Perl is required to process the directives in \
it with 'pod2man' etc."
LICENSE = "GPL-3.0-or-later"

PV = "50"

RPM_NAME = "perl-Pod-MinimumVersion-50-2.14.noarch.rpm"
RPM_HASH = "d8f109a5b3f37584b7bcf94a7daeb4372b4646563f4531ceb136e1811fc0eb02b543152f9353601d6609766ca8684f9fe4ee9647994f908b65a802f73cc46973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--MinimumVersion \
perl-Pod--MinimumVersion--Parser \
perl-Pod--MinimumVersion--Report \
perl-Pod-MinimumVersion"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-IO--String \
perl-Pod--Parser \
perl-version"

inherit rpm
