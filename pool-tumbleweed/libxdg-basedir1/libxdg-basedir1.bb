SUMMARY = "XDG Base Directory Specification Library"
DESCRIPTION = "The XDG Base Directory Specification defines where should user files be looked \
for by defining one or more base directories relative in with they should be \
located. \
 \
This library implements functions to list the directories according to the \
specification and provides a few higher-level functions."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libxdg-basedir1-1.2.3-1.7.aarch64.rpm"
RPM_HASH = "8d1bb78aeca3f5698787f634dbf5f350509719778bc041bf751f9f0263d6dc9affae2e15779b920de1615beb1f6dc002a41b048bd2fab4bc5646f05f9d0b9f57"

RPROVIDES:${PN} += "libxdg-basedir.so.1 \
libxdg-basedir1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
