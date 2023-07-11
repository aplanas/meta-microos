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

RPM_NAME = "python310-smbprotocol-1.10.1-1.5.noarch.rpm"
RPM_HASH = "e0b6adc20954b6cef5ed005fe26fcfbaa7ceced02ddce54675636e4798a1f7df1c9ba71b3737c2027e814f078f572a9a28f57338ac14f190900503655897253c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-smbprotocol \
python310-smbprotocol \
python3dist-smbprotocol"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-pyspnego"

inherit rpm
