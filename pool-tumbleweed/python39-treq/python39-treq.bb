SUMMARY = "HTTP library inspired by python-requests"
DESCRIPTION = "treq is an HTTP library inspired by requests but written on top of Twisted’s Agents. \
It provides a simple, higher level API for making HTTP requests when using Twisted."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python39-treq-22.2.0-3.1.noarch.rpm"
RPM_HASH = "050cd01fc2141dc1037ac63894f61c1f700846b93766ef0261db8f9ca4486f53ac7584ff536ede36fabdac332c21498591ed0533d62c87a519a386ffa0caee9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-treq \
python39-treq \
python3dist-treq"

RDEPENDS:${PN} += "python-abi \
python39-Twisted-tls \
python39-attrs \
python39-hyperlink \
python39-incremental \
python39-requests"

inherit rpm
