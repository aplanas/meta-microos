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

RPM_NAME = "python311-Trolly-0.2.2-4.14.noarch.rpm"
RPM_HASH = "374fbab48e7aafcdc42a9b7527cde843ac34ecb6ac0e7bf97e4e9e844e036931d91db1473ad026ce337d352c8a403c6f87b4b20c927e8eee09ad0b650d76f90a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Trolly \
python3.11dist-trolly \
python311-Trolly \
python3dist-trolly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
