SUMMARY = "RSP High-Level Emulation Plugin For the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the RSP High-Level emulation plugin for the Mupen64plus \
Nintendo 64 Emulator."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-rsp-hle-2.5.9-2.9.aarch64.rpm"
RPM_HASH = "6656d25b9b602bc0378adcc27e6e4178f44353d2803cdfb92b5d87c58fed9fb58e11de460220ef06da3d065d351bad4571ae47dcd65a4a13b3c74cdabf109ae5"

RPROVIDES:${PN} += "mupen64plus-plugin-rsp \
mupen64plus-plugin-rsp-hle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
