SUMMARY = "Perl version for POD directives used"
DESCRIPTION = "'Pod::MinimumVersion' parses the POD in a Perl script, module, or document, \
and reports what version of Perl is required to process the directives in \
it with 'pod2man' etc."
LICENSE = "GPL-3.0-or-later"

PV = "50"

RPM_NAME = "perl-Pod-MinimumVersion-50-2.12.noarch.rpm"
RPM_HASH = "e2fbaeda62d13d7d48da2584c61e863579896080c6be69252e9a216c5a468344f45931b44b76a84fcbe9b447f78e430a99abbf961105c88a1ea50360872aafec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Pod::MinimumVersion) \
perl(Pod::MinimumVersion::Parser) \
perl(Pod::MinimumVersion::Report) \
perl-Pod-MinimumVersion"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(IO::String) \
perl(Pod::Parser) \
perl(version)"

inherit rpm
