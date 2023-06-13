SUMMARY = "ATA S.M.A.R.T. Disk Health Monitoring Library"
DESCRIPTION = "A small and lightweight parser library for ATA S.M.A.R.T. hard disk \
health monitoring."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19"

RPM_NAME = "libatasmart4-0.19-10.12.aarch64.rpm"
RPM_HASH = "e90a88a9055c7860a8e7923e5321a6b54b97eee89bbf9e6138ff54abc814065d23337987c9b60df6ecf1e08096f70e1bfd63cf825e521ee1f3b7dcdd33b8971d"

RPROVIDES:${PN} += "libatasmart.so.4()(64bit) \
libatasmart4 \
libatasmart4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
