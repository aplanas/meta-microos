SUMMARY = "Zypper plugin to manage RPM keys"
DESCRIPTION = "Zypper plugin for RPM key management"
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "zypper-keys-plugin-0.3.0-1.2.noarch.rpm"
RPM_HASH = "0c25a43b5b7ac121cbd3ed0004165b613a4035590d02adde8408d88fce7ee71de785a8749c620de1c9cf6bfb4c5edb773aaecec2a51c032963705ab72d6aef58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zyppkeys \
python3dist-zyppkeys \
zypper-keys-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
curl \
python-abi \
python3-pytz \
python3-requests \
sudo \
zypper"

inherit rpm
