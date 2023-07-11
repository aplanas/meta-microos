SUMMARY = "HTTP library inspired by python-requests"
DESCRIPTION = "treq is an HTTP library inspired by requests but written on top of Twisted’s Agents. \
It provides a simple, higher level API for making HTTP requests when using Twisted."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python310-treq-22.2.0-3.1.noarch.rpm"
RPM_HASH = "286763efacd660d873eb584ad1c73c7bb12c008c0b91b3a66b1264235b9127d87882f734378bd21c641bae0a222faca486a995e0f4beea78e02816396898c40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-treq \
python310-treq \
python3dist-treq"

RDEPENDS:${PN} += "python-abi \
python310-Twisted-tls \
python310-attrs \
python310-hyperlink \
python310-incremental \
python310-requests"

inherit rpm
