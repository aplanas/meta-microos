SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.1.0.post3"

RPM_NAME = "python39-apiron-7.1.0.post3-1.1.noarch.rpm"
RPM_HASH = "ef101c63922c36ca2521c566d1f073127852b4694a018fa165f3136246c62dddd18d672bdd577ccfc80b5cf87a07da7502df02b332bd396d2b72a96fccba8d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apiron \
python39-apiron \
python3dist-apiron"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
