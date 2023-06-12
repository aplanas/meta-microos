SUMMARY = "An economy and city building game"
DESCRIPTION = "Unknown Horizons is a 2D realtime strategy simulation with an emphasis on \
economy and city building. The player has to expand a small settlement to a strong and \
wealthy colony, collect taxes and supply inhabitants with valuable \
goods, and increase the power with a well balanced economy and with strategic \
trade and diplomacy."
LICENSE = "APL-1.0 & CC-BY-SA-3.0 & GPL-2.0-with-font-exception & MIT & OFL-1.1"

PV = "2019.1"

RPM_NAME = "unknown-horizons-2019.1-7.6.noarch.rpm"
RPM_HASH = "8655d908f94bd234300af5ab3a7ba7daf53a6a11a026b6593918fbb9d289c744ae1689b7bc926acb3f3bb3a12621d3378b1ed4f0a704a88f3eb1975035470da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(unknown-horizons.desktop) \
metainfo() \
metainfo(unknown-horizons.appdata.xml) \
unknown-horizons"
RDEPENDS:${PN} += "/usr/bin/python3 \
hicolor-icon-theme \
python(abi) \
python3-Pillow \
python3-PyYAML \
python3-fife"

inherit rpm