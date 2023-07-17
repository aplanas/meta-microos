SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python310-scp-0.14.4-2.1.noarch.rpm"
RPM_HASH = "d3f14e8704f0804ad72a08bc8c86dcf33caf36765a25cf36b71a84aecb17ee4c20652708f4788d2138cfae441951b9dd526793f2a2e18f252268bbe300038da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scp \
python310-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python310-paramiko"

inherit rpm
