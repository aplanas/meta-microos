SUMMARY = "Tools for managing lensfun data"
DESCRIPTION = "This package contains tools to fetch lens database updates and manage lens \
adapters in lensfun."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "lensfun-tools-0.3.4-1.1.aarch64.rpm"
RPM_HASH = "2446e345ffae3e21d4c8f45ade20f49eef413925e697778ca324cf4620ce5df68f857156a47c9a212c82f0de1312bcb28c2eae6246886eeb070a1e33de41a819"

RPROVIDES:${PN} += "lensfun-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
lensfun-data \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
liblensfun.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
python3-lensfun"

inherit rpm
