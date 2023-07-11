SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-devel-1.3-10.1.aarch64.rpm"
RPM_HASH = "02325f47def93ad2e3d911c7b1eb21ba8c710f843c7f2676b0601e3563871f9d69b117a892a9f9e271a32f16279a70b38061341f6fe81125a8366a8c10ba6292"

RPROVIDES:${PN} += "dialog-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libdialog15"

inherit rpm
