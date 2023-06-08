SUMMARY = "Application Entry Editor"
DESCRIPTION = "A program to edit application entries shown in the application menu, \
and to edit their properties."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "appeditor-1.1.3-2.4.aarch64.rpm"
RPM_HASH = "30fa5e3b3a800ef596e30a42ba99034c49a22e9f15be380880712ca52f1fd364a3df23f60608d86a7a7f0bc758d861eae3b36ef96dcf04f4091998cccc1b96de"

RPROVIDES:${PN} += "appeditor appeditor(aarch-64) application() application(com.github.donadigo.appeditor.desktop) metainfo() metainfo(com.github.donadigo.appeditor.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgranite.so.6()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
