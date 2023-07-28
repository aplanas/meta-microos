SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.1.0.post3"

RPM_NAME = "python311-apiron-7.1.0.post3-1.1.noarch.rpm"
RPM_HASH = "4de8ff2d6d37e63f7f719c39a289eef089b3d403daa7a486be4076bcfb36036c66b1c2aee240c3483c671c4762d6527fd64c87f8c7ce038d417e9292e3dea491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apiron \
python3.11dist-apiron \
python311-apiron \
python3dist-apiron"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
