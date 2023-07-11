SUMMARY = "The Runtime for the Curses Development Kit - Shared library"
DESCRIPTION = "CDK is a widget set developed on top of the basic curses library. It \
contains 21 ready to use widgets, some of which are: a text entry \
field, a scrolling list, a selection list, an alphalist, a pull-down \
menu, a radio list, a viewer widget, and a dialog box."
LICENSE = "BSD-3-Clause"

PV = "5.0.20230201"

RPM_NAME = "libcdk6_3_4-5.0.20230201-1.1.aarch64.rpm"
RPM_HASH = "b26b4c4629ff87045988bc990cbe9ac1e8ebca54916b7bd7da115c9c9cc6202cdad0a80d46729034991cf5465fb1d651dd20077b838c43fdb9beaa4e0efaaad4"

RPROVIDES:${PN} += "libcdk.so.6.3.4 \
libcdk6-3-4 \
libcdkw.so.6.3.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
