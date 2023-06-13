SUMMARY = "Development files for raylib"
DESCRIPTION = "Development files and headers for raylib."
LICENSE = "Zlib"

PV = "4.5.0"

RPM_NAME = "raylib-devel-4.5.0-1.1.aarch64.rpm"
RPM_HASH = "14d9dba6f2fdee3d139b7329788a36a967a552f28a0afc68ab76248e14e5580c39b60e295e5d78b6072f1031c1fd7471dcf0414a91ef1e86d160e00716f6149e"

RPROVIDES:${PN} += "cmake(raylib) \
pkgconfig(raylib) \
raylib-devel \
raylib-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraylib420 \
openal-soft-devel"

inherit rpm
