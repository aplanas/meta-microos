SUMMARY = "Development files for libepoxy"
DESCRIPTION = "Epoxy is a library for handling OpenGL function pointer management for you. \
 \
It hides the complexity of dlopen(), dlsym(), glXGetProcAddress(), \
eglGetProcAddress(), etc. from the app developer, with very little knowledge \
needed on their part. They get to read GL specs and write code using undecorated \
function names like glCompileShader(). \
 \
Development files."
LICENSE = "MIT"

PV = "1.5.10"

RPM_NAME = "libepoxy-devel-1.5.10-2.2.aarch64.rpm"
RPM_HASH = "f8deffa3b25468c05023478971aefaf4f9858f1b2fc1788967baaa8e9cd17ddb31a1cb9546b3b432bd8328eeeb8c1569c937741161c77337e33418068583c93f"

RPROVIDES:${PN} += "libepoxy-devel \
pkgconfig-epoxy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libepoxy0 \
pkgconfig-egl \
pkgconfig-gl \
pkgconfig-x11"

inherit rpm
