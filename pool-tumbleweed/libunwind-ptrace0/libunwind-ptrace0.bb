SUMMARY = "Call chain detection library for ptraced processes"
DESCRIPTION = "A C programming interface (API) to determine the call chains of \
another process by means of using ptrace(2) on it."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "libunwind-ptrace0-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "13a0249a3cdb5580d30116508534bf6985ef58719172a1c6ec875d0df4944204f6449219ca358c9e2083b206207f95b42528dd553e407a5113d5b7d9388dd460"

RPROVIDES:${PN} += "libunwind-ptrace.so.0 \
libunwind-ptrace0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
