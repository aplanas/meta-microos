SUMMARY = "DLT - Diagnostic Log and Trace: Libraries"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Libraries."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-libs-2.18.8-4.4.aarch64.rpm"
RPM_HASH = "a32c61d4a920f7a6eb33e37f618acefd6c3de4dcb02600ef22df2bd5e34bd972901759f2e4cb9cc3501e35a07ccc1659e9582d64aef16f562b88f7e70c7a22f6"

RPROVIDES:${PN} += "dlt-libs \
dlt-libs(aarch-64) \
libdlt.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
