SUMMARY = "XCB utility module for X keycode constants and conversions"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- keysyms: Standard X key constants and conversion to/from keycodes."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "libxcb-keysyms1-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "51227c01da84c08609fcd73ec588e57a42e7b0cf7699dd439b744229c720eb148f754d58ef591944718013dae3404c42ec873bee49ab295fab8908c9f322b87a"

RPROVIDES:${PN} += "libxcb-keysyms.so.1()(64bit) \
libxcb-keysyms1 \
libxcb-keysyms1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
