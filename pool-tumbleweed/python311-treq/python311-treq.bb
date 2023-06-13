SUMMARY = "HTTP library inspired by python-requests"
DESCRIPTION = "treq is an HTTP library inspired by requests but written on top of Twisted’s Agents. \
It provides a simple, higher level API for making HTTP requests when using Twisted."
LICENSE = "MIT"

PV = "22.2.0"

RPM_NAME = "python311-treq-22.2.0-2.7.noarch.rpm"
RPM_HASH = "6c660da576ff46eb0f306dc89ccb1b04d9162896a7685033e816227df061a8434ad5447b1670df962511b58dc8da98f491286223d01134751a77b358ee34798f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(treq) \
python311-treq \
python3dist(treq)"

RDEPENDS:${PN} += "python(abi) \
python311-Twisted-tls \
python311-attrs \
python311-hyperlink \
python311-incremental \
python311-requests"

inherit rpm
