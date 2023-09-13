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

RPM_NAME = "python39-smbprotocol-1.11.0-1.1.noarch.rpm"
RPM_HASH = "3a1e17863582cd1b995280c22d6f25922376b7c224cc3cc71407141b813951f5d8dcf0c00a05258604f7718e1ce155798cd4bf19e3d719fa99b66097ccff7ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-smbprotocol \
python39-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-pyspnego"

inherit rpm
