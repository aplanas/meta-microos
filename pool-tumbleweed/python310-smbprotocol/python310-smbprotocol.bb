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

PV = "1.11.0"

RPM_NAME = "python310-smbprotocol-1.11.0-1.1.noarch.rpm"
RPM_HASH = "c5b825224bc6544aa667da5182a630f3935ea401b00cdd9ebcbcc2d41ab4c573c0ec8e55f41d1578c3077b668abacec11a4aff262f5a2602f82bf690cb7704b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-smbprotocol \
python310-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-pyspnego"

inherit rpm
