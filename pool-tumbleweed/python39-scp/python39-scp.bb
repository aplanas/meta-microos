SUMMARY = "SSH scp module for paramiko"
DESCRIPTION = "The scp.py module uses a paramiko transport to send and receive files via the \
scp protocol. This is the protocol as referenced from the openssh scp program, \
and has only been tested with this implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.14.4"

RPM_NAME = "python39-scp-0.14.4-1.6.noarch.rpm"
RPM_HASH = "159ac1b4dbc37617e274e1e98695fa759759ee031ca9385e79d5f61690f6f74cff9975c1564bf3313f2b0c6f9d8d1d0437a8361a9cc27a6315682e91ff470be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scp \
python39-scp \
python3dist-scp"

RDEPENDS:${PN} += "python-abi \
python39-paramiko"

inherit rpm
