SUMMARY = "Python library for NETCONF clients"
DESCRIPTION = "ncclient is a Python library that facilitates client-side scripting \
and application development around the NETCONF protocol."
LICENSE = "Apache-2.0"

PV = "0.6.13"

RPM_NAME = "python39-ncclient-0.6.13-1.6.noarch.rpm"
RPM_HASH = "81256e3d41b8b66e93c2de775bb967734b7aee543ef73c18d5cadcb248ac38e65e6f43b2a88493c89c889bcb788d1f118acc3de14dddfae4d390ca4e981a4519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ncclient \
python39-ncclient \
python3dist-ncclient"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-paramiko \
python39-setuptools \
python39-six"

inherit rpm
