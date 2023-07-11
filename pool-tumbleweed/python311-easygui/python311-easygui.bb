SUMMARY = "Function-driven python GUI programming"
DESCRIPTION = "EasyGui provides an interface for simple GUI interaction with a user. \
It's not event-driven and it does not require the programmer to know \
anything about tkinter, frames, widgets, callbacks or lambda."
LICENSE = "BSD-3-Clause"

PV = "0.98.3"

RPM_NAME = "python311-easygui-0.98.3-1.6.noarch.rpm"
RPM_HASH = "4a8a2dd5b42c819a120f8ca4f47e2357bbed2f42954d463be6ae1c888944cd6b162e8d0cff4246dd16ffafa01b9ba3be5b2c79bf727e381d578c558819061eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easygui \
python3.11dist-easygui \
python311-easygui \
python3dist-easygui"

RDEPENDS:${PN} += "python-abi"

inherit rpm
