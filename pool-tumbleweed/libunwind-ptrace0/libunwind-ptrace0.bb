SUMMARY = "Call chain detection library for ptraced processes"
DESCRIPTION = "A C programming interface (API) to determine the call chains of \
another process by means of using ptrace(2) on it."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "libunwind-ptrace0-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "1996d7d95b9cadc25a9bf5259199f09ed9fb2eb992fd9f3f1890034cbfcc6007f7befdd7dbc8b7d6bd5f193dbea5dd437d677dbd6ffbe6a74b31045ec93915c3"

RPROVIDES:${PN} += "libunwind-ptrace.so.0 \
libunwind-ptrace0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libunwind-aarch64.so.8"

inherit rpm
