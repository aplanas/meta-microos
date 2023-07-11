SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python39-apache-libcloud-3.7.0-3.1.noarch.rpm"
RPM_HASH = "4bafd8414a2a9828b83b4b3504ef7f5361beb452b8b437236fcc7ed0a2ed586c412552e49c600eabdf58c1da051fb738e6811e2db3c51e8a239c86f45af9e25c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apache-libcloud \
python39-apache-libcloud \
python3dist-apache-libcloud"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-requests \
python39-typing"

inherit rpm
