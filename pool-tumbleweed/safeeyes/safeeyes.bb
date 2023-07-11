SUMMARY = "Tool for reminding the user to take breaks"
DESCRIPTION = "This utility reminds the user to take breaks whilst they are working \
at the computer in an effort to alleviate eye strain (asthenopia)."
LICENSE = "GPL-3.0-only"

PV = "2.1.6"

RPM_NAME = "safeeyes-2.1.6-1.1.noarch.rpm"
RPM_HASH = "5d7313c935e6c151c05aa06e932761ecd50ed3011b99f765a6a206cdcdad4c268288f909f95036c8ff78f351b45d20be689fb9d5bb72e5c65e452858645c6ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-safeeyes \
python3dist-safeeyes \
safeeyes"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Babel \
python3-cairo \
python3-croniter \
python3-gobject \
python3-psutil \
python3-python-xlib \
typelib-AppIndicator3 \
typelib-Notify"

inherit rpm
