SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.5"

RPM_NAME = "python311-scp-0.14.5-1.1.noarch.rpm"
RPM_HASH = "8728675fc4fbfd3c0f9e0e2c74b75de082f12c36477858beae277294be569355d6be9b6c2cd4ad040b17711c630ad39937abe8266ee918e25d7b2cc56778571c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scp \
python3.11dist-scp \
python311-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python311-paramiko"

inherit rpm
