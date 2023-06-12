SUMMARY = "Startup script shared by all Python interpreters"
DESCRIPTION = "The primary purpose of this package is to share script which can \
be run via PYTHONSTARTUP variable of any Python interpreter."
LICENSE = "Python-2.0"

PV = "0.1"

RPM_NAME = "shared-python-startup-0.1-6.9.noarch.rpm"
RPM_HASH = "e4f9df0213cbd29f7c5706811f1fff3c2273dae787afedab99236e96385898ea8cb6a3e6b426e76adb39366c1d9453064b62738b4fc6a89c61a42fa263822766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(shared-python-startup) \
shared-python-startup"
RDEPENDS:${PN} += ""

inherit rpm
