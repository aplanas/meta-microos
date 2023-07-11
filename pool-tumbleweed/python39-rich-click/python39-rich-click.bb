SUMMARY = "Format click help output nicely with rich"
DESCRIPTION = "Format click help output nicely with rich."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "python39-rich-click-1.6.1-1.3.noarch.rpm"
RPM_HASH = "5454eb43659bb7ed1afa4db1178fc2eb741c1ea3f504c4292e9d474f798dec5ba758a3f474747f3c5c7637bab76c395871049b48524e8aacdb455a6732011976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rich-click \
python39-rich-click \
python3dist-rich-click"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-rich"

inherit rpm
