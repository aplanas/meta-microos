SUMMARY = "Python library for NETCONF clients"
DESCRIPTION = "ncclient is a Python library that facilitates client-side scripting \
and application development around the NETCONF protocol."
LICENSE = "Apache-2.0"

PV = "0.6.13"

RPM_NAME = "python310-ncclient-0.6.13-1.6.noarch.rpm"
RPM_HASH = "e6ab385f202ce448739cad8ec1a1620c0b7452af0284bc3efa807d31fbc9bbd920a67ad4028cabe3c32db2f2f3d93ab8e1b266a6bc2c9eadaa1f82ea6a038a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ncclient \
python310-ncclient \
python3dist-ncclient"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-paramiko \
python310-setuptools \
python310-six"

inherit rpm
