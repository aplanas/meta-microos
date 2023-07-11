SUMMARY = "Tools that can be used when using DevIL libraries"
DESCRIPTION = "Tools that can be used to work with DevIL libraries and convert various \
formats."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "1.7.8"

RPM_NAME = "libdevil-tools-1.7.8-11.12.aarch64.rpm"
RPM_HASH = "bb472bd27abb3965b5e573b82b1c354fa4af5dc193d860506ab189754f5812480145b859095fb11cd60614ac95a1bec343bb323d02ec9b55f95264190bd68bd5"

RPROVIDES:${PN} += "libdevil-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIL.so.1 \
libIL1 \
libILU.so.1 \
libc.so.6"

inherit rpm
