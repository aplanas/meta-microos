SUMMARY = "Annotate AST trees with source code positions"
DESCRIPTION = "Annotate AST trees with source code positions"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python311-asttokens-2.2.1-2.3.noarch.rpm"
RPM_HASH = "8e2edbf1eb38aaddd04e7e2e5e203df6ab47b415e76c6f5ca64f68af6b1fe8d11482fdd061565f50af6f0fe1ecbce3814f74441dc19be5979165059b5c821f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asttokens \
python3.11dist-asttokens \
python311-asttokens \
python3dist-asttokens"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
