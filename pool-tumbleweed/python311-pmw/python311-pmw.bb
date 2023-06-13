SUMMARY = "High-level compound widgets in Python using the Tkinter module"
DESCRIPTION = "A toolkit for building high-level compound widgets in Python using the Tkinter \
module. It contains a set of flexible and extensible megawidgets, including \
notebooks, comboboxes, selection widgets, paned widgets, scrolled widgets and \
dialog windows."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-pmw-2.0.1-3.17.noarch.rpm"
RPM_HASH = "8fd80ad632121f2e02d3335519124223197aeb80f4d0da0284d486a71e4a277953dd070417355f4f66ebcedf7b4a645601d5e609b1361104883a4ea082e0f9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pmw) \
python311-pmw \
python3dist(pmw)"

RDEPENDS:${PN} += "python(abi) \
python311-tk"

inherit rpm
