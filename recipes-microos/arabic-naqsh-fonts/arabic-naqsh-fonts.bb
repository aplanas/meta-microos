SUMMARY = "Arabic Naqsh Font"
DESCRIPTION = "Arabic TrueType font (Naqsh family)."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "arabic-naqsh-fonts-2.1-18.15.noarch.rpm"
RPM_HASH = "317313ede4a1ebcadf1fb475dcfbeec03d5b586fcd2023a8d5255d4e07241df10302156ed22ac2811e1d4a84cb0d4643e1023efd6b73cbdcd96ee6e5c6ab11bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-naqsh-fonts locale(ar)"
RDEPENDS:${PN} += ""

inherit rpm
