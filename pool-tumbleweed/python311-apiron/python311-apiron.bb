SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python311-apiron-7.0.0-1.5.noarch.rpm"
RPM_HASH = "78e1cf40bf724e7d701f7e4fa02d8ea0a1a6d1020ff60bf57aa94ac2cdc832424edb8a9eda3e901f081e7e4645f7b74ef89c4b148564c50d1cb87ab409e64c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apiron \
python3.11dist-apiron \
python311-apiron \
python3dist-apiron"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
