SUMMARY = "SSH public key parser"
DESCRIPTION = "OpenSSH Public Key Parser for Python"
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python310-sshpubkeys-3.3.1-1.8.noarch.rpm"
RPM_HASH = "b581a231695b14343240366240810a7d6562db364c6b97eba538cef9990e28aa314ce92d8f7ea592835911ac479504e6b6d2c3104a3cb395fead0425b6e703e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sshpubkeys \
python3.10dist(sshpubkeys) \
python310-sshpubkeys \
python3dist(sshpubkeys)"

RDEPENDS:${PN} += "python(abi) \
python310-cryptography \
python310-ecdsa"

inherit rpm
