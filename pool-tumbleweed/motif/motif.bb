SUMMARY = "Motif Runtime Programs"
DESCRIPTION = "This package provides programs of the Motif runtime enviroment."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "motif-2.3.8-2.5.aarch64.rpm"
RPM_HASH = "0179b267085d17994c72a438c5772006ac70c8826da55b538b6663c849495ac332ee7b002fb93d631ec3c8b0d24af4ae68823ff33073971f06f016df6fff485a"

RPROVIDES:${PN} += "config-motif \
motif \
openmotif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
