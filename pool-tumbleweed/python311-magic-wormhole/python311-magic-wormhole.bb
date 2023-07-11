SUMMARY = "Tool for transferring files through a secure channel"
DESCRIPTION = "This package provides a library and a command-line tool named wormhole, \
which makes it possible to get arbitrary-sized files and directories from \
one computer to another. The two endpoints are identified by using identical \
'wormhole codes': in general, the sending machine generates and displays \
the code, which must then be typed into the receiving machine."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python311-magic-wormhole-0.12.0-6.6.noarch.rpm"
RPM_HASH = "74a54b2b8483e5481c71b34425f61e05c2ebc2dbdbbc6f8bd101a36bca115c2e1026cb456e40630094ef4869ce6201fc91cc4b2e14a90cdd92ec8006f1aa59e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole \
python3.11dist-magic-wormhole \
python311-magic-wormhole \
python3dist-magic-wormhole"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Automat \
python311-PyNaCl \
python311-click \
python311-hkdf \
python311-humanize \
python311-magic-wormhole-mailbox-server \
python311-service-identity \
python311-spake2 \
python311-tqdm \
python311-txtorcon \
update-alternatives"

inherit rpm
