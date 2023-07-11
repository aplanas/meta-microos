SUMMARY = "Python NETCONF protocol library - Documentation"
DESCRIPTION = "This package contains documentation files for python-ncclient."
LICENSE = "Apache-2.0"

PV = "0.6.13"

RPM_NAME = "python-ncclient-doc-0.6.13-1.6.noarch.rpm"
RPM_HASH = "2176bdf1f12a6662e315b1270aa9ceece83b1dcf200ae7d8a0dc3913cff13ee6abc50fec1e8af7f6616471eefebcf5dd3c2d2d39a9df4bd6f797f21a42eb9c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ncclient-doc \
python310-python-ncclient-doc \
python311-python-ncclient-doc \
python39-python-ncclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
