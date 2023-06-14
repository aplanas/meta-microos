SUMMARY = "Package manager and meta build tool for the D programming language"
DESCRIPTION = "Package Manager for the D Programming language. \
DUB emerged as a more general replacement for vibe.d's package manager. \
It does not imply a dependecy to vibe.d for packages and was extended to \
not only directly build projects, but also to generate project files \
(currently VisualD). Mono-D also support the use of dub.json \
(dub's package description) as project file."
LICENSE = "MIT"

PV = "1.29.0"

RPM_NAME = "dub-1.29.0-1.4.aarch64.rpm"
RPM_HASH = "4600ac490641b39d3f6125e2fdf6a479139decd7806f06700a76a15c08b3d94095cb7dc160a00801d2895be57f19d603d4e964221fe5f969c4a746988b9c3c32"

RPROVIDES:${PN} += "dub"

RDEPENDS:${PN} += "libc.so.6 \
libdruntime-ldc-shared.so.102 \
libgcc-s.so.1 \
libm.so.6 \
libphobos2-ldc-shared.so.102"

inherit rpm
