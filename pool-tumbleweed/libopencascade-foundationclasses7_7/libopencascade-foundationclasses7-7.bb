SUMMARY = "OpenCASCADE foundation classes libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE foundation classes module: \
  TKernel TKMath"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-foundationclasses7_7-7.7.0-1.4.aarch64.rpm"
RPM_HASH = "640881048cb7fc4101d635649b2a7f3347e45cf5a8d79c36320bcc4a7662a05921c25126f9ec9f7bdc96dcfc0187f7d97d42adf3b06c240c3e6970586cc82351"

RPROVIDES:${PN} += "libTKMath.so.7.7 \
libTKernel.so.7.7 \
libopencascade-foundationclasses7-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
