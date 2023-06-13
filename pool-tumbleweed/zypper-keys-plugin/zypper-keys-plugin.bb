SUMMARY = "Zypper plugin to manage RPM keys"
DESCRIPTION = "Zypper plugin for RPM key management"
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "zypper-keys-plugin-0.3.0-1.1.noarch.rpm"
RPM_HASH = "6e6176bc7135df8e324cad694810754128e94fd008f2297758d44b34ee933555e1e583b7b1c6b8f53cfc893c58af31a09d0c738fa1230fabc96c5c483cc730ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(zyppkeys) \
python3dist(zyppkeys) \
zypper-keys-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
curl \
python(abi) \
python3-pytz \
python3-requests \
sudo \
zypper"

inherit rpm
