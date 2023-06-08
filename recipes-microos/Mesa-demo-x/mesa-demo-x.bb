SUMMARY = "GLX-based demos"
DESCRIPTION = "This package contains some common GLX-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-x-9.0.0-1.1.aarch64.rpm"
RPM_HASH = "bdde7e044e298b3033df7ebd3fd5934ad1d325235ce04c77856698a2a11d9dc71e846d658fd07367337bf6ca7285f312a377c1bbfcc29b141a6dec0a04863edf"

RPROVIDES:${PN} += "Mesa-demo-x Mesa-demo-x(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
