SUMMARY = "Annotate AST trees with source code positions"
DESCRIPTION = "Annotate AST trees with source code positions"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python310-asttokens-2.2.1-2.1.noarch.rpm"
RPM_HASH = "b9624d11775e28839a561f61d1b595a94de6cc57fada0dd1431d1af7791c9ed5496a47652a185434fcb3b3c9cbe8d477f7261457a6db79500b33352706b4cbc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asttokens \
python3.10dist(asttokens) \
python310-asttokens \
python3dist(asttokens)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
