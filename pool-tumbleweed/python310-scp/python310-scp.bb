SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python310-scp-0.14.4-1.6.noarch.rpm"
RPM_HASH = "12e60bc2c0188795db4378200992cd724857141c769ec6e4d4e340de50790e6dd37ab5fa0deed358ee79d30c4e1f34db9895c849a0bd2496579bd2cfc4e6a6ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scp \
python310-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python310-paramiko"

inherit rpm
