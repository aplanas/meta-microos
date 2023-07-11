SUMMARY = "Library for Vamp audio analysis plugins"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "libvamp-sdk2-2.10.0-1.13.aarch64.rpm"
RPM_HASH = "94bc8f2f8feab169c4fc6a684a10e53816476f0b18eee1be65fab788510c9b97acef5ae0a4d11816c5f3674ff626d9b14e0717eab8302a41a78fdee5ae17153d"

RPROVIDES:${PN} += "libvamp-sdk.so.2 \
libvamp-sdk2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
