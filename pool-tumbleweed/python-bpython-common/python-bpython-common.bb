SUMMARY = "Fancy Interface to the Python Interpreter - common files"
DESCRIPTION = "This package contains files shared between the various versions of \
Bpython. You don't need to install this directly, packages that \
require it will pull it in automatically."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python-bpython-common-0.24-2.3.noarch.rpm"
RPM_HASH = "134d6b2831ad473597a434c8c466c004082a8f95c16d4f28546efdef0d2faa964673e23140a5f785f106f1840b8902e99008e31653ce447ae06c98a458fbacd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-common \
python310-bpython-common \
python311-bpython-common \
python39-bpython-common"

RDEPENDS:${PN} += ""

inherit rpm
