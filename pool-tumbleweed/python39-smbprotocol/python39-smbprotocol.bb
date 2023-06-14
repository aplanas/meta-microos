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

RPM_NAME = "python39-smbprotocol-1.10.1-1.3.noarch.rpm"
RPM_HASH = "bde37fd52e1dbbdef56e7b8f73ef7fe755f968ecc115e73bc07d78d70455a1107bbad158548fde7c358f2d33f604ef35f3a8303f03e5839d1533d70c59749537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-smbprotocol \
python39-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-pyspnego"

inherit rpm
