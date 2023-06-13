SUMMARY = "XCB utility module for the Render extension"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- renderutil: Convenience functions for the Render extension."
LICENSE = "MIT"

PV = "0.3.10"

RPM_NAME = "libxcb-render-util0-0.3.10-1.2.aarch64.rpm"
RPM_HASH = "8cca8cf85c76f8e22935afb13c5428247b9476d0c8b11b420ac043685d236f27ea5d0f1a9abbfa711d22f213fe93212a905bba3b2302d13aedbc330e802767dd"

RPROVIDES:${PN} += "libxcb-render-util.so.0()(64bit) \
libxcb-render-util0 \
libxcb-render-util0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb-render.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
