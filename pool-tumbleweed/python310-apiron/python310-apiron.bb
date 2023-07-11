SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python310-apiron-7.0.0-1.5.noarch.rpm"
RPM_HASH = "bf386857125f053283711b410a8af3a01e5f22e4a43308aea29330802b22d2deb8656fc7f913bdafbf75260785afc82a9099f2408a7f86332a4e75a0ec61b041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apiron \
python310-apiron \
python3dist-apiron"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
