SUMMARY = "Python library for NETCONF clients"
DESCRIPTION = "ncclient is a Python library that facilitates client-side scripting \
and application development around the NETCONF protocol."
LICENSE = "Apache-2.0"

PV = "0.6.13"

RPM_NAME = "python310-ncclient-0.6.13-1.4.noarch.rpm"
RPM_HASH = "c8d268cbff2a53b2c55f07386b67046078cb6bd77285a18d57f8d6dc92aaa6021e35bbfb207a52728957996853b330871458bf9469a47e0628f5724c6a0d0815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ncclient \
python3.10dist(ncclient) \
python310-ncclient \
python3dist(ncclient)"

RDEPENDS:${PN} += "python(abi) \
python310-lxml \
python310-paramiko \
python310-setuptools \
python310-six"

inherit rpm
