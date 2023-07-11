SUMMARY = "Perl version for POD directives used"
DESCRIPTION = "'Pod::MinimumVersion' parses the POD in a Perl script, module, or document, \
and reports what version of Perl is required to process the directives in \
it with 'pod2man' etc."
LICENSE = "GPL-3.0-or-later"

PV = "50"

RPM_NAME = "perl-Pod-MinimumVersion-50-2.13.noarch.rpm"
RPM_HASH = "ff0fbc2034ae330df2c056e46144456bfaa98d196266119c259399b718a3a4eeb3bde54199476a633bbbf8453c9411035bd7ec7e5295da5f3fac68981a22c4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--MinimumVersion \
perl-Pod--MinimumVersion--Parser \
perl-Pod--MinimumVersion--Report \
perl-Pod-MinimumVersion"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-IO--String \
perl-Pod--Parser \
perl-version"

inherit rpm
