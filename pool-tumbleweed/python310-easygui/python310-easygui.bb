SUMMARY = "Function-driven python GUI programming"
DESCRIPTION = "EasyGui provides an interface for simple GUI interaction with a user. \
It's not event-driven and it does not require the programmer to know \
anything about tkinter, frames, widgets, callbacks or lambda."
LICENSE = "BSD-3-Clause"

PV = "0.98.3"

RPM_NAME = "python310-easygui-0.98.3-1.6.noarch.rpm"
RPM_HASH = "dbf392b6b565273e434024a0845ce815088946563b8cd378214ad33defe33c6ba553ab5f97c4350fecf8844fe893ae895fd75932b6024319f1a7b12ceab8b209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-easygui \
python310-easygui \
python3dist-easygui"

RDEPENDS:${PN} += "python-abi"

inherit rpm
