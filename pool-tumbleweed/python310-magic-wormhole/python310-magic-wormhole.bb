SUMMARY = "Tool for transferring files through a secure channel"
DESCRIPTION = "This package provides a library and a command-line tool named wormhole, \
which makes it possible to get arbitrary-sized files and directories from \
one computer to another. The two endpoints are identified by using identical \
'wormhole codes': in general, the sending machine generates and displays \
the code, which must then be typed into the receiving machine."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python310-magic-wormhole-0.12.0-6.6.noarch.rpm"
RPM_HASH = "449d371e7cac12c5f4b7f59ff291e94a3c0af3fa568368ce4d38c33c893890a03c1608773dfbd2d7499944e0d7e52e3b8f2cf261933cc3f1911fb0810a5f7e28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-magic-wormhole \
python310-magic-wormhole \
python3dist-magic-wormhole"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Automat \
python310-PyNaCl \
python310-click \
python310-hkdf \
python310-humanize \
python310-magic-wormhole-mailbox-server \
python310-service-identity \
python310-spake2 \
python310-tqdm \
python310-txtorcon \
update-alternatives"

inherit rpm
