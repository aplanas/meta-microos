SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python311-scp-0.14.4-1.4.noarch.rpm"
RPM_HASH = "6dceff5116ef03f8d6fcc4f1202a0e5760dd1afae6fcd35c593eb91619290c54d40f80670a589b4f314343ef620b3828f304330694d3230a38de1f21b7638aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-scp \
python311-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python311-paramiko"

inherit rpm
