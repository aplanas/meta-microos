SUMMARY = "High-level compound widgets in Python using the Tkinter module"
DESCRIPTION = "A toolkit for building high-level compound widgets in Python using the Tkinter \
module. It contains a set of flexible and extensible megawidgets, including \
notebooks, comboboxes, selection widgets, paned widgets, scrolled widgets and \
dialog windows."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-pmw-2.0.1-3.17.noarch.rpm"
RPM_HASH = "f188ebf7b7373621d4edd77528390da343ae00d5cd998afc7ab0f7ba9beac1afd392c4c50357d6e3d9fb4189803218f0ad9da7b7fb72888005f8329fd16d5f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pmw) \
python39-pmw \
python3dist(pmw)"

RDEPENDS:${PN} += "python(abi) \
python39-tk"

inherit rpm
