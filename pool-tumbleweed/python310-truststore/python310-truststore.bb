SUMMARY = "Verify certificates using OS trust stores"
DESCRIPTION = "Verify certificates using OS trust stores. Supports macOS, \
Windows, and Linux (with OpenSSL). This project should be \
considered experimental."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-truststore-0.4.0-1.6.noarch.rpm"
RPM_HASH = "4ea013d3372899cdee67a8d57634dbf7d78fe789155f9df4a9934b4f74a53113e8ac52d9e6c5722b6655f400d3d4d98460a3f9b6655ba6ec21d0261af15d1129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-truststore \
python310-truststore \
python3dist-truststore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
