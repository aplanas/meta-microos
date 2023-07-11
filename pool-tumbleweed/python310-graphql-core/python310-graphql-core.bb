SUMMARY = "GraphQL implementation for Python"
DESCRIPTION = "GraphQL implementation for Python, a port of GraphQL.js, \
the JavaScript reference implementation for GraphQL."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python310-graphql-core-3.2.3-2.2.noarch.rpm"
RPM_HASH = "5efd1d6f064f4bb3c1be40a4842811145ff936f426ce01cfcba2bbaee4994e05765b364fb7d9f5271356f4ccc15edd1f64970136d5fb5d1415ffcf19a59d9b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-graphql-core \
python310-graphql-core \
python3dist-graphql-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
