SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python311-scp-0.14.4-1.6.noarch.rpm"
RPM_HASH = "8f400e642909d9288a50a3be41213085b725cb43f5130c2376b69ba943f9a332567282c58e635a91fcf7b7a493138cc2e71b987198bdb12a36ccd79b886d6741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scp \
python3.11dist-scp \
python311-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python311-paramiko"

inherit rpm
