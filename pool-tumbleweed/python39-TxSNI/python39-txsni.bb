SUMMARY = "Python module for running a TLS server with Twisted"
DESCRIPTION = "This package brings support for running a TLS server with Twisted."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-TxSNI-0.2.0-3.4.noarch.rpm"
RPM_HASH = "7ea7643dd9d444ba51e0ea582929197962d3186e351bea6057124fdfbdcde826db189dcc409b763f100ba6fe00a345bdd25567097e5f01e45e285dcef15579ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(txsni) \
python39-TxSNI \
python3dist(txsni)"

RDEPENDS:${PN} += "python(abi) \
python39-Twisted-tls \
python39-pyOpenSSL"

inherit rpm
