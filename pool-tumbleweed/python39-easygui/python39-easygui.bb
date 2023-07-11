SUMMARY = "Function-driven python GUI programming"
DESCRIPTION = "EasyGui provides an interface for simple GUI interaction with a user. \
It's not event-driven and it does not require the programmer to know \
anything about tkinter, frames, widgets, callbacks or lambda."
LICENSE = "BSD-3-Clause"

PV = "0.98.3"

RPM_NAME = "python39-easygui-0.98.3-1.6.noarch.rpm"
RPM_HASH = "e6d5d6ba32ed1b11c920a61b83be054c5d3f9249790c15e1aa773d2577c7574a45bdef62263cfd526d717d133fda01334be073b9f04ac577f019d2ae18d2b84d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-easygui \
python39-easygui \
python3dist-easygui"

RDEPENDS:${PN} += "python-abi"

inherit rpm
