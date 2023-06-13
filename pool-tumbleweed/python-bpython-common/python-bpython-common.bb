SUMMARY = "Fancy Interface to the Python Interpreter - common files"
DESCRIPTION = "This package contains files shared between the various versions of \
Bpython. You don't need to install this directly, packages that \
require it will pull it in automatically."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python-bpython-common-0.24-2.1.noarch.rpm"
RPM_HASH = "63a4f7ba82f8ab15cbfcfcab7fecda28b00aac8eb9bc41a69279ed7011231bb792ba7bb2fa31c8fa7e91096c88330a62ec35cceb51f8686b54bc04a35379f5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-common \
python310-bpython-common \
python311-bpython-common \
python39-bpython-common"

RDEPENDS:${PN} += ""

inherit rpm
