SUMMARY = "Python library for NETCONF clients"
DESCRIPTION = "ncclient is a Python library that facilitates client-side scripting \
and application development around the NETCONF protocol."
LICENSE = "Apache-2.0"

PV = "0.6.13"

RPM_NAME = "python39-ncclient-0.6.13-1.4.noarch.rpm"
RPM_HASH = "1c8e1b6afd947198053ec71bc8a90618eee1bddaf0be522f653b4dbd160332c965561f50d1877b6757e77fa4f216d1389fdfd182c3bbd08f38b64f78c4a5d79b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ncclient) \
python39-ncclient \
python3dist(ncclient)"

RDEPENDS:${PN} += "python(abi) \
python39-lxml \
python39-paramiko \
python39-setuptools \
python39-six"

inherit rpm
