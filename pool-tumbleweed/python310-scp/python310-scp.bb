SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.5"

RPM_NAME = "python310-scp-0.14.5-1.1.noarch.rpm"
RPM_HASH = "bdd88a420aad8c11f393f437c31018296a37a28cfa3c9a964355f90f5dae3bc28e35ff29024a6b80563317a43e8803322e044b5fb9ef75b617e7865b7bb0a98c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scp \
python310-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python310-paramiko"

inherit rpm
