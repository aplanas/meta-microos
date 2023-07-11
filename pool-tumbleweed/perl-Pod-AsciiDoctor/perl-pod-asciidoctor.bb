SUMMARY = "Convert from POD to AsciiDoc"
DESCRIPTION = "Convert from POD to AsciiDoc"
LICENSE = "Apache-2.0"

PV = "0.101002"

RPM_NAME = "perl-Pod-AsciiDoctor-0.101002-1.2.noarch.rpm"
RPM_HASH = "efc8a7c9eeab4b8c51437ff9a6771588013f1a48a6b7f2467452edcdb4958a845f29745c3ada28180da705c9a3b0b3c0d846ef4fc3d3372c00f252f4dfa51785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--AsciiDoctor \
perl-Pod-AsciiDoctor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Pod--Parser \
perl-parent"

inherit rpm
