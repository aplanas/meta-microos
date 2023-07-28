SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.1.0.post3"

RPM_NAME = "python310-apiron-7.1.0.post3-1.1.noarch.rpm"
RPM_HASH = "f134f2da8d47a022030fe3be93c70a07ca36e9d0581f8f6b4691c54e20b36743ca3f139c40d7bce0021d0bcefff42dfd4f6a48244d6b874f97400748fc412078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apiron \
python310-apiron \
python3dist-apiron"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
