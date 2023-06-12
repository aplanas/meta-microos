SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python310-apache-libcloud-3.7.0-2.1.noarch.rpm"
RPM_HASH = "b81a0116a96b543d50102b1fafda8a0a9e16eb3e0133e787367ee713ec4d65ae5b2691b7bf240cb183803f7f9c51aec7bb294e1e835f5cb2ecfc46af9b3c1741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apache-libcloud \
python3.10dist(apache-libcloud) \
python310-apache-libcloud \
python3dist(apache-libcloud)"
RDEPENDS:${PN} += "python(abi) \
python310-lxml \
python310-requests \
python310-typing"

inherit rpm
