SUMMARY = "Fcitx tools to make tables"
DESCRIPTION = "Tools to convert txt word sheets to fcitx tables. \
 \
see manpage for details"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-tools-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "7b357025e0601c743d7328b5b1415d1e5f2aec0ed29fd1bc3b85cafb630d3e1123f7ce63a63e2a52fc7f10a4cf733dc04fbf1ba5291f311456af54a9358d9a4a"

RPROVIDES:${PN} += "fcitx-table-tools \
fcitx-table-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfcitx-config.so.4()(64bit) \
libfcitx-utils.so.0()(64bit)"

inherit rpm
