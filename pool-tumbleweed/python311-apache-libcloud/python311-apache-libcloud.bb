SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python311-apache-libcloud-3.7.0-3.1.noarch.rpm"
RPM_HASH = "55d6790f68cf652d6877f906c6c8774527bb5bae1d206d5ef98334f54dcda560fa4b68dc2cd67bff6e78ae38adff1425cac7d9648f7a1c46dec07e0910a9d350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apache-libcloud \
python3.11dist-apache-libcloud \
python311-apache-libcloud \
python3dist-apache-libcloud"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-requests \
python311-typing"

inherit rpm
