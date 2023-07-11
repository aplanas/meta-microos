SUMMARY = "High-level compound widgets in Python using the Tkinter module"
DESCRIPTION = "A toolkit for building high-level compound widgets in Python using the Tkinter \
module. It contains a set of flexible and extensible megawidgets, including \
notebooks, comboboxes, selection widgets, paned widgets, scrolled widgets and \
dialog windows."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-pmw-2.0.1-3.18.noarch.rpm"
RPM_HASH = "60d2092ed010e5658b5bfd618b45cef06af019e98e8881a49a001c7dbf5eda0352bb7b0ff1004f94f0432c84afcd28551bb85d14caa8fc4480d6b9046dadedb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pmw \
python39-pmw \
python3dist-pmw"

RDEPENDS:${PN} += "python-abi \
python39-tk"

inherit rpm
