SUMMARY = "Titlesequences for openRCT2"
DESCRIPTION = "This package contains tilesequences like the original ones \
used in RollerCoaster Tycoon 1 and 2. \
When using RCT1 sequences, the original RCT1 files have to be installed."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "openrct2-titlesequences-0.4.3-3.1.noarch.rpm"
RPM_HASH = "865941054f8ba61ce275411bc8716b702e964d626d8b3c3bed59dad57daa1ade983ed825c0dae5ee9b96c1924a1479216ff9f984655be82dba98663c9852c85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openrct2-titlesequences"

RDEPENDS:${PN} += "openrct2"

inherit rpm
