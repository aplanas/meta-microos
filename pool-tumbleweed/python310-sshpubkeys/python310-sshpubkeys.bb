SUMMARY = "SSH public key parser"
DESCRIPTION = "OpenSSH Public Key Parser for Python"
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python310-sshpubkeys-3.3.1-2.3.noarch.rpm"
RPM_HASH = "3fd072ba4c38519cdb4e6430adaf446f066b6afab338a07bfffad23069dc163ad7f0fc1de6f6c9c0f9ad2e1836039ff605919f24acb3476143dc522d43634c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sshpubkeys \
python310-sshpubkeys \
python3dist-sshpubkeys"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-ecdsa"

inherit rpm
