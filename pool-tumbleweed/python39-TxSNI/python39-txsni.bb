SUMMARY = "Python module for running a TLS server with Twisted"
DESCRIPTION = "This package brings support for running a TLS server with Twisted."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-TxSNI-0.2.0-3.6.noarch.rpm"
RPM_HASH = "375d6f49db10bebec63f4418e6d4e0c0252b01e93a8b29ff040c5519e5e3e4e354517506c5f2395678399e60e29fc6012912b388fc008980481d06017c62de45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-txsni \
python39-TxSNI \
python3dist-txsni"

RDEPENDS:${PN} += "python-abi \
python39-Twisted-tls \
python39-pyOpenSSL"

inherit rpm
