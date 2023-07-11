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

RPM_NAME = "python310-Trolly-0.2.2-4.14.noarch.rpm"
RPM_HASH = "aef44f523458b3c9b4c1d35561d5d1714d46419b08a54cb2e49889836462f4a16f2bedec63724c12ecbf8b8883cc4428e65a9e86f08204247d15b844824a2b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-trolly \
python310-Trolly \
python3dist-trolly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
