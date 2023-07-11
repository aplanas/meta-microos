SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python39-apiron-7.0.0-1.5.noarch.rpm"
RPM_HASH = "4e7770a8059144e29392f5934d24a25f00e5843f72dfd5fc8fbcb33d67f16039ab1c3b4d61cce9d7fb9025bcb4a36c775388fdc6211789f6f3ac026abb5d6479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apiron \
python39-apiron \
python3dist-apiron"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
