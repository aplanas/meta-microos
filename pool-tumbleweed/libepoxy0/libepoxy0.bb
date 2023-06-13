SUMMARY = "OpenGL function pointer management library"
DESCRIPTION = "Epoxy is a library for handling OpenGL function pointer management for you. \
 \
It hides the complexity of dlopen(), dlsym(), glXGetProcAddress(), \
eglGetProcAddress(), etc. from the app developer, with very little knowledge \
needed on their part. They get to read GL specs and write code using undecorated \
function names like glCompileShader()."
LICENSE = "MIT"

PV = "1.5.10"

RPM_NAME = "libepoxy0-1.5.10-2.2.aarch64.rpm"
RPM_HASH = "0772d515b7b0d0a5742f4fe88061e6cd46e4b417f68240da1d961381d2cdd370ba0f363e05f72eef92707f5ae485d50b76c882fda2ec0d770a8e5f87e64969a2"

RPROVIDES:${PN} += "libepoxy.so.0()(64bit) \
libepoxy0 \
libepoxy0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
