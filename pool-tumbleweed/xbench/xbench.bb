SUMMARY = "Benchmark for X11"
DESCRIPTION = "A benchmark for X11."
LICENSE = "SUSE-Public-Domain"

PV = "0.2"

RPM_NAME = "xbench-0.2-1242.11.aarch64.rpm"
RPM_HASH = "cee9d9fb95c034b52b0b98936372bcb04d58c4fff4547b049c21f0c397de9bcccbdcaec83e335ba1ed18ff61a0a3042339029c2f1e23eb967319244bd10d8a32"

RPROVIDES:${PN} += "xbench"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
