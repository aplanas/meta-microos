SUMMARY = "SSH public key parser"
DESCRIPTION = "OpenSSH Public Key Parser for Python"
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python311-sshpubkeys-3.3.1-2.3.noarch.rpm"
RPM_HASH = "4f7c6fb03439e13db4b683ce653a05fa0f480a2efc7b5c23629afaf6668f4a045fc85537f402d6011c64fe76d8bd8e70f0035edd49605a69bf636ab0d1324eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sshpubkeys \
python3.11dist-sshpubkeys \
python311-sshpubkeys \
python3dist-sshpubkeys"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-ecdsa"

inherit rpm
