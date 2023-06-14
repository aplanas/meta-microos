SUMMARY = "HTTP library inspired by python-requests"
DESCRIPTION = "treq is an HTTP library inspired by requests but written on top of Twisted’s Agents. \
It provides a simple, higher level API for making HTTP requests when using Twisted."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python310-treq-22.2.0-2.7.noarch.rpm"
RPM_HASH = "8e8725e643c63759e802220bc9ea004ecf3afe11ef40fc79b2ee6f47efd50cc340ef1c7715daa4ed7e3b945ecedc560b4267f8053d361b79f1763d6c2c7d7d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-treq \
python3.10dist-treq \
python310-treq \
python3dist-treq"

RDEPENDS:${PN} += "python-abi \
python310-Twisted-tls \
python310-attrs \
python310-hyperlink \
python310-incremental \
python310-requests"

inherit rpm
