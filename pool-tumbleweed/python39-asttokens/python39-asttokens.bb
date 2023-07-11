SUMMARY = "Annotate AST trees with source code positions"
DESCRIPTION = "Annotate AST trees with source code positions"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python39-asttokens-2.2.1-2.3.noarch.rpm"
RPM_HASH = "2ba625f8ad9409402f0a8bb6bcbf08da6244e18abd07c04f212884bad6f54aa238fe1299b87457dad67646f40752d6e1cf0fc636205054f78691fe40bf97365a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asttokens \
python39-asttokens \
python3dist-asttokens"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
