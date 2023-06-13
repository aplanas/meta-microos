SUMMARY = "RSP High-Level Emulation Plugin For the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the RSP High-Level emulation plugin for the Mupen64plus \
Nintendo 64 Emulator."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-plugin-rsp-hle-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "6d702fa38ead9c020959fba174ed6aee442775b1461656b45b2b0c4f6d0345e5e4ef5c162d1eb6a39fd8559074b7be6b447c3ba794b3c85a1dc020881dfd391d"

RPROVIDES:${PN} += "mupen64plus-plugin-rsp \
mupen64plus-plugin-rsp-hle \
mupen64plus-plugin-rsp-hle(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
