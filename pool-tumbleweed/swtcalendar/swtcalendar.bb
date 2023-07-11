SUMMARY = "GUI date picker for Java using SWT"
DESCRIPTION = "SWTCalendar is a port of Kai Toedter's JCalendar to Eclipse's SWT. \
It is a GUI date picker for Java using SWT as the GUI toolkit. \
SWTCalendar was designed to be a flexible component so developer \
can embed a date picker in their application or create their own \
standalone date picker dialog."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "swtcalendar-0.5-3.7.noarch.rpm"
RPM_HASH = "14e1ead821d2360dab3fb96ba0b3b353e40d0cb4558b4be8e8f8c1c4c1860dc218cb6d584e94531f101fd0eb3ebe0e2456f2ee1688fdb7ee7cb63b04b62bb082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swtcalendar"

RDEPENDS:${PN} += ""

inherit rpm
