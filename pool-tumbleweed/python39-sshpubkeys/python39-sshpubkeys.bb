SUMMARY = "SSH public key parser"
DESCRIPTION = "OpenSSH Public Key Parser for Python"
LICENSE = "BSD-3-Clause"

PV = "3.3.1"

RPM_NAME = "python39-sshpubkeys-3.3.1-2.3.noarch.rpm"
RPM_HASH = "a669e31a5a42cc1c6fe7eec9cbe064271b1df6a28ba4f8d6f002d6ec815af9b65f2230c0cf856c206f18d31151630db0daf623272b9de5e4676443afc1f7538f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sshpubkeys \
python39-sshpubkeys \
python3dist-sshpubkeys"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-ecdsa"

inherit rpm
