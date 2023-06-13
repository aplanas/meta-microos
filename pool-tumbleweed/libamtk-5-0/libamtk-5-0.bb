SUMMARY = "Shared Library for AMTK"
DESCRIPTION = "“Actions, Menus and Toolbars Kit” or just AMTK is a basic \
GtkUIManager replacement based on GAction, suitable for \
both a traditional UI or a modern UI with a GtkHeaderBar. \
 \
This package provides the AMTK Shared Library"
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "libamtk-5-0-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "ad9d24e17883bc9408e7b8207f1383ff6b7ca19463bc411348bfcc38884c1b7c259879305864516c5f686b596ae74b5f8b02611dc672f04daad008d84c07eb06"

RPROVIDES:${PN} += "amtk-5 \
libamtk-5-0 \
libamtk-5-0(aarch-64) \
libamtk-5.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
