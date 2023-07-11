SUMMARY = "Python library for NETCONF clients"
DESCRIPTION = "ncclient is a Python library that facilitates client-side scripting \
and application development around the NETCONF protocol."
LICENSE = "Apache-2.0"

PV = "0.6.13"

RPM_NAME = "python311-ncclient-0.6.13-1.6.noarch.rpm"
RPM_HASH = "e6122039b9fd2e0ff7e87bb5eecaf800ccd98427f0e0b0cb528c6ae657bf7833cf62c2d08d6872e2e8561b669752f1a0b360699f951cd4da8625c83756dd2728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ncclient \
python3.11dist-ncclient \
python311-ncclient \
python3dist-ncclient"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-paramiko \
python311-setuptools \
python311-six"

inherit rpm
