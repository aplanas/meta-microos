SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-devel-1.3-9.7.aarch64.rpm"
RPM_HASH = "616f13d98e338022d303ccba71f9a1e06b7e33401103c29b1fd9d15dbc1110d79d20a97a2f7f082e353bd2b970a101f88211a3f800633211844c3091e0419dce"

RPROVIDES:${PN} += "dialog-devel dialog-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash libdialog15"

inherit rpm
