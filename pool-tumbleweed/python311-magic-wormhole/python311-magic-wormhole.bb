SUMMARY = "Tool for transferring files through a secure channel"
DESCRIPTION = "This package provides a library and a command-line tool named wormhole, \
which makes it possible to get arbitrary-sized files and directories from \
one computer to another. The two endpoints are identified by using identical \
'wormhole codes': in general, the sending machine generates and displays \
the code, which must then be typed into the receiving machine."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python311-magic-wormhole-0.12.0-6.4.noarch.rpm"
RPM_HASH = "8676494c638b60ae27a1a6357799ff7811e1aded79a148c0e37a1256a4d0c28ac6d9c7f8dab8787589756a9604f98ebf45ae1608a978d6325b1a0c61bf49450a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-magic-wormhole \
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
