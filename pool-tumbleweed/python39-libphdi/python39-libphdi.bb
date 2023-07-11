SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python39-libphdi-20221025-3.11.aarch64.rpm"
RPM_HASH = "1345374c124af20ebeb7ae769e19f99da803ea336fb3d21ad5263c72384cdbe7caca0b768baaff65dbadd0f1172e2a32188246e275c4fbd0dd4200ca17ad593c"

RPROVIDES:${PN} += "python39-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
