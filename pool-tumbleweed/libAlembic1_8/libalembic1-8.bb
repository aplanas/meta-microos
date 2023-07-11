SUMMARY = "Sparse volume data structure library"
DESCRIPTION = "Alembic distills complex, animated scenes into a non-procedural, application- \
independent set of baked geometric results. This ‘distillation’ of scenes into \
baked geometry is exactly analogous to the distillation of lighting and \
rendering scenes into rendered image data."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "libAlembic1_8-1.8.4-2.1.aarch64.rpm"
RPM_HASH = "23ecd63ea2f0fc51ddd68ed74c86204ccc1ff6c247097a72bbf34cb2309cbf78459ee6c6c9a2c86bb1df31eef1195b941a5c3553064542295ac86045b662030c"

RPROVIDES:${PN} += "libAlembic.so.1.8 \
libAlembic1-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
