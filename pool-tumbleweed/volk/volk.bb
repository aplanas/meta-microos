SUMMARY = "Vector-Optimized Library of Kernels"
DESCRIPTION = "VOLK provides a library of vector-optimized kernels. It is a subproject \
of GNU Radio, but can also be used standalone."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "volk-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "1bc1accc4a51c7de89b2486432c8800e91ab85902f26db85544814b359850b231c620b20b81df49f2fb679adc63d627ac7d203b5c4650be2393ef7e90c151d55"

RPROVIDES:${PN} += "bundled-cpu-features \
volk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvolk.so.3.0"

inherit rpm
