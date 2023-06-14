SUMMARY = "A set of Tkinter widgets to display readonly text and code"
DESCRIPTION = "A set of Tkinter widgets to display readonly text and code."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-tkreadonly-0.6.1-2.11.noarch.rpm"
RPM_HASH = "5402e2742fd0cf0634f7263bed3381f94ea7bb13a90ad7de6a5373b676f0ca2dfc8bf973340582b1ef6952b56bdab5773d3b8f5beb5fafb2071a72a7d9ef5dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tkreadonly \
python39-tkreadonly \
python3dist-tkreadonly"

RDEPENDS:${PN} += "python-abi \
python39-Pygments \
python39-idle \
python39-tk"

inherit rpm
