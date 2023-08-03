SUMMARY = "Fancy Interface to the Python Interpreter - common files"
DESCRIPTION = "This package contains files shared between the various versions of \
Bpython. You don't need to install this directly, packages that \
require it will pull it in automatically."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python-bpython-common-0.24-3.1.noarch.rpm"
RPM_HASH = "89fc3c7de7e08844f88c8d9eff4067d8244587f26b2c88c12e985ef1ab0c27e319c27990ac7cc5537738b8e7cbd95174eef4020caaf88f7a8eb1af941d2870ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-common \
python310-bpython-common \
python311-bpython-common \
python39-bpython-common"

RDEPENDS:${PN} += ""

inherit rpm
