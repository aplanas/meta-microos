SUMMARY = "The Runtime for the Curses Development Kit - Shared library"
DESCRIPTION = "CDK is a widget set developed on top of the basic curses library. It \
contains 21 ready to use widgets, some of which are: a text entry \
field, a scrolling list, a selection list, an alphalist, a pull-down \
menu, a radio list, a viewer widget, and a dialog box."
LICENSE = "BSD-3-Clause"

PV = "5.0.20210324"

RPM_NAME = "libcdk6_2_4-5.0.20210324-2.5.aarch64.rpm"
RPM_HASH = "b4b820188e9220d53fd9f5cddaa5955949841bbd1062e84fe6dac6cac8318786ec9143c97e9ad4ab1a23c2b39f09191bd36714598c80afc6768835b3b96bb93e"

RPROVIDES:${PN} += "libcdk.so.6.2.4()(64bit) \
libcdk6_2_4 \
libcdk6_2_4(aarch-64) \
libcdkw.so.6.2.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncurses.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
