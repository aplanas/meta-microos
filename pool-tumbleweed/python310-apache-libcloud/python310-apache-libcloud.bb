SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python310-apache-libcloud-3.7.0-3.1.noarch.rpm"
RPM_HASH = "f78cf65d0c1bf59721df59533ec3280cf7187cf419b3ae2bbd0ceb4d9f339d851eaef2eaee1836a56010fe25550516ba3bbe6f6b9d0e5fc5b78d77afb5540bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apache-libcloud \
python310-apache-libcloud \
python3dist-apache-libcloud"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-requests \
python310-typing"

inherit rpm
