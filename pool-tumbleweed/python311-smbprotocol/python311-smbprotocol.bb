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

RPM_NAME = "python311-smbprotocol-1.11.0-1.1.noarch.rpm"
RPM_HASH = "4583a437a1f673e12892302c602d02fb626d193b5e97c102e95e4862bcf4e63c30155dfe1d41cdb3836c285005b15e4e56e4818ab4edc0cf71a43915b818c2d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smbprotocol \
python3.11dist-smbprotocol \
python311-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-pyspnego"

inherit rpm
