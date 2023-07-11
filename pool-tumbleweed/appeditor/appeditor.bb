SUMMARY = "Application Entry Editor"
DESCRIPTION = "A program to edit application entries shown in the application menu, \
and to edit their properties."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "appeditor-1.1.3-2.5.aarch64.rpm"
RPM_HASH = "96fe1b087efdd5d47a5ac4ee67beb105496d75cba6f6a8f5334eaf3bc9e80d7c19cc883bb2111fe581ae6c1212b1bd886a4e5e910c7c8bd04018f417b21284f7"

RPROVIDES:${PN} += "appeditor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
