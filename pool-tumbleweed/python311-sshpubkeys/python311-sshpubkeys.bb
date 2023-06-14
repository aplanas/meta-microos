SUMMARY = "SSH public key parser"
DESCRIPTION = "OpenSSH Public Key Parser for Python"
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python311-sshpubkeys-3.3.1-1.8.noarch.rpm"
RPM_HASH = "0d6c533cc07ec92b76c6e27702e116992cc2910984123a7312c1a29e68ab21528f9a3ab32369b3d5479ddcfd77cfec6c4e68707bb054cd205248ab1c11aec006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sshpubkeys \
python311-sshpubkeys \
python3dist-sshpubkeys"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-ecdsa"

inherit rpm
