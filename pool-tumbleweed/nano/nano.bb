SUMMARY = "Pico editor clone with enhancements"
DESCRIPTION = "GNU nano is a small and friendly text editor. It aims to emulate \
the Pico text editor while also offering a few enhancements."
LICENSE = "GPL-3.0-or-later"

PV = "7.2"

RPM_NAME = "nano-7.2-1.4.aarch64.rpm"
RPM_HASH = "5d2449f0007c06382ee54f312eacaa1f9c479eba8e746d3b93d528df636613b91c4fe1ce1bb690e25966278ffc9d64c66a120929536ca7ce37580b710e7b3d04"

RPROVIDES:${PN} += "config-nano \
nano"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
