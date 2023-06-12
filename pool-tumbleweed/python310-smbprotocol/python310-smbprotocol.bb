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

RPM_NAME = "python310-smbprotocol-1.10.1-1.3.noarch.rpm"
RPM_HASH = "f5467783f604f48b998c070ee1a641c08ea2c6987568b2d78a08e09da7b7d56c4b87fdb5f94a3992be3820ef4330a9c8ccaf4c5415300433df1465b24406f43a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smbprotocol \
python3.10dist(smbprotocol) \
python310-smbprotocol \
python3dist(smbprotocol)"
RDEPENDS:${PN} += "python(abi) \
python310-cryptography \
python310-pyspnego"

inherit rpm
