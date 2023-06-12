SUMMARY = "Bandwidth usage bar"
DESCRIPTION = "bwbar is a small program that generates a text and a graphical readout \
of the current bandwidth use to be displayed on a web page. \
 \
It is used, among others, at http://www.kernel.org/. \
 \
Authors: \
-------- \
    H. Peter Anvin <hpa@zytor.com>"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.3"

RPM_NAME = "bwbar-1.2.3-8.7.aarch64.rpm"
RPM_HASH = "cddcfd60bfbe82ce733403d1d1f40265579d944c10a66fb50db87a737dd6d9c01df44c5fa16e1599e48f9a917a8604c0fc28a65f8c482cbe49d131d5fff314f4"

RPROVIDES:${PN} += "bwbar \
bwbar(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
systemd"

inherit rpm