SUMMARY = "An economy and city building game"
DESCRIPTION = "Unknown Horizons is a 2D realtime strategy simulation with an emphasis on \
economy and city building. The player has to expand a small settlement to a strong and \
wealthy colony, collect taxes and supply inhabitants with valuable \
goods, and increase the power with a well balanced economy and with strategic \
trade and diplomacy."
LICENSE = "APL-1.0 & CC-BY-SA-3.0 & GPL-2.0-with-font-exception & MIT & OFL-1.1"

PV = "2019.1"

RPM_NAME = "unknown-horizons-2019.1-7.7.noarch.rpm"
RPM_HASH = "21a2a4d9b8cc4a2089f513e2b7ab44937bc11eed744d74370c7b0863bf830d6680df11905c61892d271a5c860ca8ceb7c2bd57847d1163bf2ede0b346c0afbcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unknown-horizons"

RDEPENDS:${PN} += "/usr/bin/python3 \
hicolor-icon-theme \
python-abi \
python3-Pillow \
python3-PyYAML \
python3-fife"

inherit rpm
