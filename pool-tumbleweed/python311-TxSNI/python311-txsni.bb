SUMMARY = "Python module for running a TLS server with Twisted"
DESCRIPTION = "This package brings support for running a TLS server with Twisted."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-TxSNI-0.2.0-3.6.noarch.rpm"
RPM_HASH = "ef0b8d7a12c9a4f21bb7ed3bd2f5c7a3edcdf3292fe026260caf58c4c7f0f8c40e86fb04247a8fd2b2a5c727e579a17a8a795fd18f3f4f9e250bcb88b0f11cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-TxSNI \
python3.11dist-txsni \
python311-TxSNI \
python3dist-txsni"

RDEPENDS:${PN} += "python-abi \
python311-Twisted-tls \
python311-pyOpenSSL"

inherit rpm
