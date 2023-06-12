SUMMARY = "C/C++ function declaration translator"
DESCRIPTION = "Cdecl is a program which will turn English-like phrases such as \
'declare foo as array 5 of pointer to function returning int' into C \
declarations such as 'int (*foo[5])()' and vice-versa. It handles \
typecasts and C++ as well, and offers command line editing and \
history."
LICENSE = "GPL-3.0-or-later"

PV = "14.2"

RPM_NAME = "cdecl-14.2-1.1.aarch64.rpm"
RPM_HASH = "6806e82ee011fc9244ae6152e207d823f89e9f39110366f9766f83c4ee718bf0f49fb11cbcc45cf79633d80f684231c5f4d92f7fa8f047f8573769b324f7dd3d"

RPROVIDES:${PN} += "cdecl \
cdecl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libreadline.so.8()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm