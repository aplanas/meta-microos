SUMMARY = "High-level compound widgets in Python using the Tkinter module"
DESCRIPTION = "A toolkit for building high-level compound widgets in Python using the Tkinter \
module. It contains a set of flexible and extensible megawidgets, including \
notebooks, comboboxes, selection widgets, paned widgets, scrolled widgets and \
dialog windows."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-pmw-2.0.1-3.18.noarch.rpm"
RPM_HASH = "3fdf45b95e428b52ecd48946af93e8d852e8cdc113baaa51fbde7b8fd75cce8f7d60f5d191dbe355587d84ced710bd56eb7b68bdfcad9282438395051e5ea8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pmw \
python3.11dist-pmw \
python311-pmw \
python3dist-pmw"

RDEPENDS:${PN} += "python-abi \
python311-tk"

inherit rpm
