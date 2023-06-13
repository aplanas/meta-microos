SUMMARY = "Linux kernel trace event library"
DESCRIPTION = "The libtraceevent library provides APIs to access kernel tracepoint events located in the tracefs file system under the events directory."
LICENSE = "GPL-2.0-only"

PV = "1.7.2"

RPM_NAME = "libtraceevent1-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "754b374c20b690a1378f7ae05e79240b2ae2fdaa456ed4611bfdba1ffbb0c7f10cb83facf22060858384c5f8e719d7fb1de390be60e767e5e6982440331841e7"

RPROVIDES:${PN} += "libtraceevent.so.1()(64bit) \
libtraceevent1 \
libtraceevent1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
