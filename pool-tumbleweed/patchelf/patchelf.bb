SUMMARY = "A utility for patching ELF binaries"
DESCRIPTION = "PatchELF is a simple utility for modifing existing ELF executables and \
libraries.  It can change the dynamic loader ('ELF interpreter') of \
executables and change the RPATH of executables and libraries."
LICENSE = "GPL-3.0-only"

PV = "0.18.0"

RPM_NAME = "patchelf-0.18.0-1.2.aarch64.rpm"
RPM_HASH = "cf1df849f40790fd3e1dc34e949ad57334d578a62637fce80ff1f75cd7878bbe703a15ddd29c0d29ecab13b6cbb2a1dc53c097d9e8b7bc7648acb79e43b2c62c"

RPROVIDES:${PN} += "patchelf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
