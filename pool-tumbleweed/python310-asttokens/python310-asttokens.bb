SUMMARY = "Annotate AST trees with source code positions"
DESCRIPTION = "Annotate AST trees with source code positions"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python310-asttokens-2.2.1-2.3.noarch.rpm"
RPM_HASH = "034cc211386a79cd27607067e9da770a2b787d67140039bd60c5d9d191c23631328671e7f2e851f8a91da95f880ca7b8d763026da9b13cde9b0cf25fd8a54fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asttokens \
python310-asttokens \
python3dist-asttokens"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
