SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python311-apache-libcloud-3.7.0-2.1.noarch.rpm"
RPM_HASH = "0f61382c602bc81ea546dfa4d044d31061f6f240fc51180953f4470d6737fe1ea1c3fc3c5ae61f884a22262fff5f9709e9265fdee4839da5b61ed4f193aff75b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(apache-libcloud) \
python311-apache-libcloud \
python3dist(apache-libcloud)"

RDEPENDS:${PN} += "python(abi) \
python311-lxml \
python311-requests \
python311-typing"

inherit rpm
