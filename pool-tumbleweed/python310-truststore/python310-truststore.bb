SUMMARY = "Verify certificates using OS trust stores"
DESCRIPTION = "Verify certificates using OS trust stores. Supports macOS, \
Windows, and Linux (with OpenSSL). This project should be \
considered experimental."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-truststore-0.4.0-1.4.noarch.rpm"
RPM_HASH = "d63aa43bfb089ed993011401f04af5611c10a027f85d23f03cb98d5e08cf44984c0bc0563138c8f2db3068e7712a5b164f0629ab9443d6ecb7c806f4a04feb48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-truststore \
python3.10dist-truststore \
python310-truststore \
python3dist-truststore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
