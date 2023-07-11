SUMMARY = "Trello api"
DESCRIPTION = "A Python wrapper around the Trello API. Provides a group of \
Python classes to represent Trello Objects. None of the classes \
cache values as they are designed to be inherited and extended to \
suit the needs of each user. Each class includes a basic set of \
methods based on general use cases. This library was based on \
work done by [sarumont](https://github.com/sarumont/py-trello). \
Very little was kept from this code, but still props on the \
initial work."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-Trolly-0.2.2-4.14.noarch.rpm"
RPM_HASH = "51860f8951e39733c8b7523fdd0d53f99f550a522691cc5b0ad8fb2ed54a197f89062259ebad1ce3b6bbf0053b9bb99980842582f3ebed3e3c80e16aa4752fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-trolly \
python39-Trolly \
python3dist-trolly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
