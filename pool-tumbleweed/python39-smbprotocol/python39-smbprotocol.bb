SUMMARY = "SMBv2/v3 client for Python 2 and 3"
DESCRIPTION = "This library implements the SMBv2 and SMBv3 protocol. \
 \
Features \
-------- \
-  Negotiation of the SMB 2.0.2 protocol to SMB 3.1.1 (Windows 10/Server \
   2016) \
-  Authentication with both NTLM and Kerberos \
-  Message signing \
-  Message encryption (SMB 3.x.x+) \
-  Connect to a Tree/Share \
-  Opening of files, pipes and directories \
-  Set create contexts when opening files \
-  Read and writing of files and pipes \
-  Sending IOCTL commands \
-  Sending of multiple messages in one packet (compounding)"
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "python39-smbprotocol-1.10.1-1.5.noarch.rpm"
RPM_HASH = "3628136ca59331e5ecfc2db2e05b333cd1e5ae7c0b627a645ba1c6cee9085c9152e52796baf4c42d2674bc995828ac7e59f3d11a25568d4b0e9f9de46c7b8bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-smbprotocol \
python39-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-pyspnego"

inherit rpm
