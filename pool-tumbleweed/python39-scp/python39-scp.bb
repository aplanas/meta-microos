SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python39-scp-0.14.4-2.1.noarch.rpm"
RPM_HASH = "779ab3af2501f5bc6ea5d6b195fedd35746fbc5c9334a036d339a4dcd0b77cf54f1f17bf3a9690c0eaba8d26014d057cdf3ec818fd697eb0381ed161a68ff1d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scp \
python39-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python39-paramiko"

inherit rpm
