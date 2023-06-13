SUMMARY = "Call chain detection library for ptraced processes"
DESCRIPTION = "A C programming interface (API) to determine the call chains of \
another process by means of using ptrace(2) on it."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "libunwind-ptrace0-1.6.2-4.5.aarch64.rpm"
RPM_HASH = "59edf3e5fbdd7bbd765ab189cf39de2737e272330a8554952cc8595388465fbce23c9f6838ad0693b1fb2f1c0ce2c15cd078051d78485796d89b5737937d3f23"

RPROVIDES:${PN} += "libunwind-ptrace.so.0()(64bit) \
libunwind-ptrace0 \
libunwind-ptrace0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
