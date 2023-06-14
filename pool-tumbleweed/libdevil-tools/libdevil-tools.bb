SUMMARY = "Tools that can be used when using DevIL libraries"
DESCRIPTION = "Tools that can be used to work with DevIL libraries and convert various \
formats."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "1.7.8"

RPM_NAME = "libdevil-tools-1.7.8-11.11.aarch64.rpm"
RPM_HASH = "e46ce4c66fdbb95fca555a0ff75b6b69215ccf7b7777edd615639887af344f9973ef85bd0cdcb45aac182442b023d444a547357c65efca29b3ca63d63e5b1d1f"

RPROVIDES:${PN} += "libdevil-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIL.so.1 \
libIL1 \
libILU.so.1 \
libc.so.6"

inherit rpm
