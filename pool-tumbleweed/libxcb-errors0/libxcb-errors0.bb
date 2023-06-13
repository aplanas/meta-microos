SUMMARY = "XCB errors library"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- errors: port of utility library that gives human readable names to error \
  codes and event codes and also to major and minor numbers"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libxcb-errors0-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "2ca50802bb25217ce2de9b0038dda607b5679f5c036e64f64fb08c00259767d25f35c7c08a4f7dd8c97872ab0a26b480c94196bab2eceb2b62b669af2e25e807"

RPROVIDES:${PN} += "libxcb-errors.so.0()(64bit) \
libxcb-errors0 \
libxcb-errors0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
