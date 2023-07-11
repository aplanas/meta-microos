SUMMARY = "Intelligent predictive text entry platform (tools and demos)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package contains the tools required to generate custom statistical data used by the presage predictive text engine to generate predictions. \
 \
This package also contains simple demonstration programs and simulator."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "presage-0.9.1-13.2.aarch64.rpm"
RPM_HASH = "91d6e154b9d4157d795e5b3da6079217be222fc1bbefe147e3c679ab2de747feebf07dea1e2a898ce166d77deb01c97fbb3938c0e4a33dad9473cd290ad206b0"

RPROVIDES:${PN} += "presage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpresage.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
