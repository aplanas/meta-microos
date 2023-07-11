SUMMARY = "Calculation of Gröbner fans"
DESCRIPTION = "Gfan is a software package for computing Gröbner fans and tropical \
varieties. These are polyhedral fans associated to polynomial ideals."
LICENSE = "GPL-2.0-only"

PV = "0.6.2"

RPM_NAME = "gfan-0.6.2-4.14.aarch64.rpm"
RPM_HASH = "4ada50bbd6b2d9b01cf93f0f1f93724fa806dc954bd009eb2e9bb8d9ae6cd66f11d517b620462ed4f903d2fcf266948b64dd51b2c3e21dbe4d5de923dcf2be89"

RPROVIDES:${PN} += "gfan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcddgmp.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
