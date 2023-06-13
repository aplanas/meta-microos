SUMMARY = "XCB cursor library (libxcursor port)"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- cursor: port of libxcursor"
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "libxcb-cursor0-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "3fb5dc032f9126e37e30fa400c649959fd5529fe0f70db5bbb9d1173663cf2abfcdc1c7094ad433865d425e27658319183e35773fdb072328c1d13db324dfa3d"

RPROVIDES:${PN} += "libxcb-cursor.so.0()(64bit) \
libxcb-cursor0 \
libxcb-cursor0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb-image.so.0()(64bit) \
libxcb-render-util.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
