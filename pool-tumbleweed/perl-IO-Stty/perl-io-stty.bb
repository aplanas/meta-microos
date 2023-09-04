SUMMARY = "Change and print terminal line settings"
DESCRIPTION = "This is the PERL POSIX compliant stty."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-IO-Stty-0.04-1.15.noarch.rpm"
RPM_HASH = "41322ad60ba9f3c0a9f6ce0de303a9bfc29daac996d8d0f50f514e240d8e917f82f7eb9d5643cdec5a952b0dd1cbc74fdd712e4cc9793e8402b74625f4203372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Stty \
perl-IO-Stty"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
