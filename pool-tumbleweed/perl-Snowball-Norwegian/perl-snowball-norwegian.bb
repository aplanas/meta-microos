SUMMARY = "Porters stemming algorithm for norwegian."
DESCRIPTION = "Porters stemming algorithm for norwegian."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-Snowball-Norwegian-1.2-14.27.noarch.rpm"
RPM_HASH = "426d20419eb1ffda1741cb688ac2e93c9598522b139849797fe59737fbfa5bd9e8063d8a20cd576bda1ea5a52e3e629ab23555aec489eb5b3d137016cf2ef49d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--No \
perl-Snowball-Norwegian"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
