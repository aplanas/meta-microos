SUMMARY = "Graphical front end for fio"
DESCRIPTION = "gfio is a gtk based graphical front-end for fio.  It is often installed on the \
testers workstation whereas fio would be installed on the server."
LICENSE = "GPL-2.0-only"

PV = "3.35"

RPM_NAME = "gfio-3.35-1.1.aarch64.rpm"
RPM_HASH = "c531ff0381827a1ade47f437d1a6992cb02513d59c9f52bfe82ec2d8721d361693f35002464373be73140b95560b0c3f3424497b9737a50f3c91844121913a61"

RPROVIDES:${PN} += "gfio"

RDEPENDS:${PN} += "fio \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libgdk-x11-2.0.so.0 \
libgfapi.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libibverbs.so.1 \
libiscsi.so.9 \
libm.so.6 \
libnbd.so.0 \
libnuma.so.1 \
librados.so.2 \
librbd.so.1 \
librdmacm.so.1 \
libz.so.1"

inherit rpm
