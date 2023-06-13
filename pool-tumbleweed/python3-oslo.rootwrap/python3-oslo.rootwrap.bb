SUMMARY = "Filtering shell commands to run as root from OpenStack services"
DESCRIPTION = "oslo.rootwrap allows fine-grained filtering of shell commands to run as root \
from OpenStack services. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python3-oslo.rootwrap-7.0.1-1.2.noarch.rpm"
RPM_HASH = "b1cde539662cec061ed1063f38dc318798c23337c8876c0fb9da381d8540832ca01552469b1727244c947f12d85d2e899a44e1054c5c5d0d36c5552f8b67d0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.rootwrap \
python3.10dist(oslo.rootwrap) \
python3dist(oslo.rootwrap)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm
