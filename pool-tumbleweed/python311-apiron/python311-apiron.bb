SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python311-apiron-7.0.0-1.3.noarch.rpm"
RPM_HASH = "47a2fc8161fa3df6ded4e80c74495ebfd24fb96771c33f333b8f8b0b0f3e816be4edb63570ae7b6f435279d1d151c260a40242b02cfebb534b6ad484d7ff4865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(apiron) \
python311-apiron \
python3dist(apiron)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
