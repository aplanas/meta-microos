SUMMARY = "Emit fedmsg messages from mailman3"
DESCRIPTION = "Emit fedmsg messages from mailman3."
LICENSE = "LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "python39-mailman3-fedmsg-plugin-0.5-1.15.noarch.rpm"
RPM_HASH = "57d6b26e0dc14afc04251d005494e86cc3b8243a2c3fbfac64559a474a3c1c4fb52ff9e5540884e3a90e3f1287b41eef7d328bf495e9c83841e904120be14f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mailman3-fedmsg-plugin \
python39-mailman3-fedmsg-plugin \
python3dist-mailman3-fedmsg-plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
