SUMMARY = "Annotate AST trees with source code positions"
DESCRIPTION = "Annotate AST trees with source code positions"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python39-asttokens-2.2.1-2.1.noarch.rpm"
RPM_HASH = "47d367e20c6681e46f3b571646d285347c6b68bc1c5d01bd8f5032826b3322ffe69be0a6243d66fe6c72cd4aa9d1ac8e7277f9283b58be893a690c660d482739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asttokens) \
python39-asttokens \
python3dist(asttokens)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
