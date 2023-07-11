SUMMARY = "Open File Monitoring"
DESCRIPTION = "Ftop is to files what top is to processes. The progress of all open files and \
file systems can be monitored. If run as a regular user, the set of open files \
will be limited to those in that user's processes (which is generally all that \
is of interest to the user). In any case, the selection of which files to \
display is possible through a wide assortment of options. As with top, the \
items are displayed in order from most to least active."
LICENSE = "GPL-3.0-only"

PV = "1.0"

RPM_NAME = "ftop-1.0-2.6.aarch64.rpm"
RPM_HASH = "229bf8966e46b399bbb8d6c8da737844f95fff3576f22fc1265c4af54cede9f01c0c4c742fe88a1a617e4f1679eff1b262fc45585be1bdebf330fda23ed0bbb5"

RPROVIDES:${PN} += "ftop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
