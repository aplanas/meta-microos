SUMMARY = "GPU Trace Visualizer"
DESCRIPTION = "Gpuvis is a Linux GPU profiler similar to GPUView on Windows. It is designed to work with trace-cmd captures and help track down Linux gpu and application performance issues."
LICENSE = "MIT"

PV = "20230221"

RPM_NAME = "gpuvis-20230221-1.2.aarch64.rpm"
RPM_HASH = "77f1d790e22debd672b9b11adc081036262933d59a7cf936127e099aceccf6f2573e107aae99e0684df9cf9e2dc02823fb7f29011e8d5fd4c8f9e3950912c2d3"

RPROVIDES:${PN} += "gpuvis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
