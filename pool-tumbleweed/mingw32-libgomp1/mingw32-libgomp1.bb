SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libgomp1-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "7fe852bb3e5cc71e28acaf051b9d5afbc4f51d1a91cfba6ff573c4054fc0db3f9450419a0d74c8906ca9a609c35640bd5f4d82abb01f75fc057945e78c23d031"

RPROVIDES:${PN} += "mingw32(libgomp-1.dll) \
mingw32-libgomp \
mingw32-libgomp1 \
mingw32-libgomp1(aarch-64)"
RDEPENDS:${PN} += "mingw32(libgcc_s_sjlj-1.dll) \
mingw32(libwinpthread-1.dll)"

inherit rpm
