SUMMARY = "Udev rules for accessing MTP devices"
DESCRIPTION = "This package contains the udev rules that allow access to USB based media \
players based on the MTP (Media Transfer Protocol) authored by \
Microsoft."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.21"

RPM_NAME = "libmtp-udev-1.1.21-1.1.aarch64.rpm"
RPM_HASH = "30a6172ef112eb7b75965ec3726bf3572252729b816a58c2faeb95269c4b70f63e5346718484d0d707c35e057899f9b15dcf74b4dfd5fd5bf7b4f01dc6bbf980"

RPROVIDES:${PN} += "libmtp-udev \
libmtp-udev(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmtp.so.9()(64bit) \
pkgconfig(udev)"

inherit rpm
