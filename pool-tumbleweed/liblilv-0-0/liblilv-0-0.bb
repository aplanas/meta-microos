SUMMARY = "C library to make use of LV2 plugins"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "liblilv-0-0-0.24.20-2.1.aarch64.rpm"
RPM_HASH = "305b220115fe643587d368f51180c831d92da644398098a0b62505f5240ea09d970a56347e9e4f26c2693868b13a9775839f8872e4591ac0d8fc35330fd5960c"

RPROVIDES:${PN} += "liblilv-0-0 \
liblilv-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libserd-0-0 \
libserd-0.so.0 \
libsord-0-0 \
libsord-0.so.0 \
libsratom-0.so.0"

inherit rpm
