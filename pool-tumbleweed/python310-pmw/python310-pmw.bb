SUMMARY = "High-level compound widgets in Python using the Tkinter module"
DESCRIPTION = "A toolkit for building high-level compound widgets in Python using the Tkinter \
module. It contains a set of flexible and extensible megawidgets, including \
notebooks, comboboxes, selection widgets, paned widgets, scrolled widgets and \
dialog windows."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-pmw-2.0.1-3.18.noarch.rpm"
RPM_HASH = "36a2de479267b45ff49e1086811168c0ec8bd576a0e41958d7d5aa51a93eb7d311f997da0b45eec5b6ac75d4fcb7c0d5814d3ee17311c1fded955d7bdba10b93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pmw \
python310-pmw \
python3dist-pmw"

RDEPENDS:${PN} += "python-abi \
python310-tk"

inherit rpm
