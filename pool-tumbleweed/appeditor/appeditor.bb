SUMMARY = "Application Entry Editor"
DESCRIPTION = "A program to edit application entries shown in the application menu, \
and to edit their properties."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "appeditor-1.1.3-2.4.aarch64.rpm"
RPM_HASH = "30fa5e3b3a800ef596e30a42ba99034c49a22e9f15be380880712ca52f1fd364a3df23f60608d86a7a7f0bc758d861eae3b36ef96dcf04f4091998cccc1b96de"

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
