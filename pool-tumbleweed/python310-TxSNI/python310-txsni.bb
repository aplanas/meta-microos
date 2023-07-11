SUMMARY = "Python module for running a TLS server with Twisted"
DESCRIPTION = "This package brings support for running a TLS server with Twisted."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-TxSNI-0.2.0-3.6.noarch.rpm"
RPM_HASH = "a0ac2e9d0d76629dedcf170c8c691f8c8153c13eca70520b60c49ad56ac64a97670fccd381df3ac9773d3f2eff50cdcf86e00abebe386ea4ebf69da5d94db677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-txsni \
python310-TxSNI \
python3dist-txsni"

RDEPENDS:${PN} += "python-abi \
python310-Twisted-tls \
python310-pyOpenSSL"

inherit rpm
