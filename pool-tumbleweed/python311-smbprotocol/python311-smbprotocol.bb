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

RPM_NAME = "python311-smbprotocol-1.10.1-1.5.noarch.rpm"
RPM_HASH = "a2567b5daf5206564e0b28ba3d1b1bb6a5162f330cb5264c6d9f81968f3d120c7c5f671a21ef5458f57359cdabc6bbe9aa03761ba45232c2fa9914a9068872cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smbprotocol \
python3.11dist-smbprotocol \
python311-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-pyspnego"

inherit rpm
