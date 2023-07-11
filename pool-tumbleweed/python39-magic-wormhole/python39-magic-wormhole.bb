SUMMARY = "Tool for transferring files through a secure channel"
DESCRIPTION = "This package provides a library and a command-line tool named wormhole, \
which makes it possible to get arbitrary-sized files and directories from \
one computer to another. The two endpoints are identified by using identical \
'wormhole codes': in general, the sending machine generates and displays \
the code, which must then be typed into the receiving machine."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python39-magic-wormhole-0.12.0-6.6.noarch.rpm"
RPM_HASH = "fe041d07cc2967ec37ec982c513b062ae2029523e4501ac64684fdcc3b68bd919483b503fab7f72afd50d79b0eaf3881e47f2feb78f452bcf99c4d9ae759748f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-magic-wormhole \
python39-magic-wormhole \
python3dist-magic-wormhole"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Automat \
python39-PyNaCl \
python39-click \
python39-hkdf \
python39-humanize \
python39-magic-wormhole-mailbox-server \
python39-service-identity \
python39-spake2 \
python39-tqdm \
python39-txtorcon \
update-alternatives"

inherit rpm
