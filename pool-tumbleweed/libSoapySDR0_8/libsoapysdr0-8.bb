SUMMARY = "Vendor and platform neutral SDR support library"
DESCRIPTION = "A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1"

RPM_NAME = "libSoapySDR0_8-0.8.1-1.12.aarch64.rpm"
RPM_HASH = "accc67ea2617a0550a994e15c6d41cc263cb5537481cae0cdc0657d6da7100bc3a7ee837eb732a8e88e0d9cf94ca2de8532233a3bbbdcf66aeb9083d615ac126"

RPROVIDES:${PN} += "libSoapySDR.so.0.8 \
libSoapySDR0-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
