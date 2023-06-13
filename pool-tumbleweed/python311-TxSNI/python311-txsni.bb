SUMMARY = "Python module for running a TLS server with Twisted"
DESCRIPTION = "This package brings support for running a TLS server with Twisted."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-TxSNI-0.2.0-3.4.noarch.rpm"
RPM_HASH = "caffccd5187ac9c0b9b0e638564951d262fc349389e438dbbd7d04e229f16708015603ad768092c4581028967f72cae8f2354be8e026912d13a502ecacae046c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(txsni) \
python311-TxSNI \
python3dist(txsni)"

RDEPENDS:${PN} += "python(abi) \
python311-Twisted-tls \
python311-pyOpenSSL"

inherit rpm
