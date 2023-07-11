SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-1.3-10.1.aarch64.rpm"
RPM_HASH = "84db09837257769ce5c60c47395df480af3f60951cb963e6fd5c56aefa598e53ce94e8b56b9483855258b3b008b38dcaac8a65bd04349eff707628f2d88aceb5"

RPROVIDES:${PN} += "config-dialog \
dialog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdialog.so.15 \
libncursesw.so.6 \
libtinfo.so.6 \
terminfo-base"

inherit rpm
