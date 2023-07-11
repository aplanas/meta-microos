SUMMARY = "Libcap utility programs"
DESCRIPTION = "This package contains utility programs handling capabilities via \
libcap."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.69"

RPM_NAME = "libcap-progs-2.69-1.2.aarch64.rpm"
RPM_HASH = "812ba289706ef6bb9db61e0129377f22c2c3a0195b57a61f5d65b63a364c962553bed8b90e86bb38a94e9ac5570726d9649eefb13b05743ec34409e0b5018219"

RPROVIDES:${PN} += "libcap-progs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcap2"

inherit rpm
