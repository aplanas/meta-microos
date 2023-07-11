SUMMARY = "VDE plug library"
DESCRIPTION = "This package contains a library that makes programs able to connect \
to a local VDE switch. The simplest one is vde_plug, contained in the vde2 package."
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdeplug3-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "403c1b722269904a2257fbd631648f583eb94c9a076b487912a6dcecde84cde7f4ad54aea47137fae603946485b9a0e3be43a6cc5627549a018ca66b2ddc542f"

RPROVIDES:${PN} += "libvdeplug.so.3 \
libvdeplug3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
