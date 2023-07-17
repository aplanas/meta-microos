SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python311-scp-0.14.4-2.1.noarch.rpm"
RPM_HASH = "c4ea05e81adac1e407f9b6ac7f366648f6ef0eeb1703957935ad00c1a9854df2b6a87b2d9a938d381f8b4c1ab4c4b0d511c3beb472606b88e42c290737844dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scp \
python3.11dist-scp \
python311-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python311-paramiko"

inherit rpm
