SUMMARY = "XCB utility module for client- and WM-side ICCCM helpers"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- icccm: Both client and window-manager helpers for ICCCM."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "libxcb-icccm4-0.4.2-1.2.aarch64.rpm"
RPM_HASH = "0e47344397f3505721fc9f2d70c0555a2874c501ebf4c51d870642821fb96052e4a7bae7767b7d6629a480d9ee3dc7ade6771b866adb0f2e5a041dd948aefc00"

RPROVIDES:${PN} += "libxcb-icccm.so.4()(64bit) \
libxcb-icccm4 \
libxcb-icccm4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
