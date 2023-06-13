SUMMARY = "Function-driven python GUI programming"
DESCRIPTION = "EasyGui provides an interface for simple GUI interaction with a user. \
It's not event-driven and it does not require the programmer to know \
anything about tkinter, frames, widgets, callbacks or lambda."
LICENSE = "BSD-3-Clause"

PV = "0.98.3"

RPM_NAME = "python311-easygui-0.98.3-1.5.noarch.rpm"
RPM_HASH = "426395256ec0bccca26162a2dd7174d262900af91cbed9e2aeab2347ce55ccb8a9573a34a8e7b48c52dca96ffbf20ee1c4fb47dae9d786a67c950d6f98376ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(easygui) \
python311-easygui \
python3dist(easygui)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
