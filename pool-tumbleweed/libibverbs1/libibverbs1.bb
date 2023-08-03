SUMMARY = "Ibverbs runtime library"
DESCRIPTION = "This package contains the ibverbs runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibverbs1-47.0-1.1.aarch64.rpm"
RPM_HASH = "44843b3a7cf56cfde29aa70e9e8629daabd50d391acf3d2904884ce37541a09ce8554deaf7216e40699dcd159c70afa9f4886284f5a1b436effe0a21f0aac06c"

RPROVIDES:${PN} += "libibverbs.so.1 \
libibverbs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
