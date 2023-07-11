SUMMARY = "The next generation profiling tool for Linux"
DESCRIPTION = "The next generation profiling tool for Linux"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "gprofng-2.40-5.3.aarch64.rpm"
RPM_HASH = "05a4298e5acf70dda0ace171cb06bb12a709d706be3b46c2ce0dbecc01c8874d15eb34a4529347cff3c51216fca744b4b336ee38e7fada5e8e2ef0e1a82b522c"

RPROVIDES:${PN} += "gprofng \
libgp-collector.so \
libgp-collectorAPI.so \
libgp-heap.so \
libgp-iotrace.so \
libgp-sync.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
