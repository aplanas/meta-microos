SUMMARY = "A window matching utility"
DESCRIPTION = "Devilspie 2 is based on the excellent program Devil's Pie by Ross Burton, and \
takes a folder as in-data, and checks that folder for LUA scripts. These \
scripts are run each time a window is opened, and the rules in them are applied \
on the window. \
 \
Unfortunately the rules of the original Devil's Pie are not supported."
LICENSE = "GPL-3.0-or-later"

PV = "0.43"

RPM_NAME = "devilspie2-0.43-3.11.aarch64.rpm"
RPM_HASH = "2868d5f22ade3beeda9a45c7f7b03abda88a8e9481104d6c1dae33deabc5c5dc2a2d4f736e8538a083d551a37e168a0d6bd4fd3ba06f49c9347571e0cbdc7004"

RPROVIDES:${PN} += "devilspie2 \
devilspie2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblua5.1.so.5()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
