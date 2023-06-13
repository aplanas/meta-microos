SUMMARY = "Function-driven python GUI programming"
DESCRIPTION = "EasyGui provides an interface for simple GUI interaction with a user. \
It's not event-driven and it does not require the programmer to know \
anything about tkinter, frames, widgets, callbacks or lambda."
LICENSE = "BSD-3-Clause"

PV = "0.98.3"

RPM_NAME = "python310-easygui-0.98.3-1.5.noarch.rpm"
RPM_HASH = "518d5bc011630d57821e556ec1eaf153f52cd8a2d3e34b7e53c2b13a943b86a6ad35d9503f7b395dc051067b46faa91134157ba0bd7af646ddca06c6022ed9a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easygui \
python3.10dist(easygui) \
python310-easygui \
python3dist(easygui)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
