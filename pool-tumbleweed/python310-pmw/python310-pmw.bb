SUMMARY = "High-level compound widgets in Python using the Tkinter module"
DESCRIPTION = "A toolkit for building high-level compound widgets in Python using the Tkinter \
module. It contains a set of flexible and extensible megawidgets, including \
notebooks, comboboxes, selection widgets, paned widgets, scrolled widgets and \
dialog windows."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-pmw-2.0.1-3.17.noarch.rpm"
RPM_HASH = "ed8d255bc1117e0b4bb4943a150a9f724efb5c59346ce1592842c289a01d98be8b8c2a24c50653cab3c2dbab26bef6ca1ea6bc12fa8d88e28ba9ce03d3d22aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pmw \
python3.10dist-pmw \
python310-pmw \
python3dist-pmw"

RDEPENDS:${PN} += "python-abi \
python310-tk"

inherit rpm
