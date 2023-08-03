SUMMARY = "Package manager and meta build tool for the D programming language"
DESCRIPTION = "Package Manager for the D Programming language. \
DUB emerged as a more general replacement for vibe.d's package manager. \
It does not imply a dependecy to vibe.d for packages and was extended to \
not only directly build projects, but also to generate project files \
(currently VisualD). Mono-D also support the use of dub.json \
(dub's package description) as project file."
LICENSE = "MIT"

PV = "1.33.0"

RPM_NAME = "dub-1.33.0-1.1.aarch64.rpm"
RPM_HASH = "cdaa14751a6320fca6cbb8940a43181714a8f9aeaa8c4547d24c79361403c1e0faa51717c6485c0f0ddfc103f7d0a4a5fc6f5517b83a0cdd4a6cfe9137d8d3a8"

RPROVIDES:${PN} += "dub"

RDEPENDS:${PN} += "libc.so.6 \
libdruntime-ldc-shared.so.102 \
libgcc-s.so.1 \
libm.so.6 \
libphobos2-ldc-shared.so.102"

inherit rpm
