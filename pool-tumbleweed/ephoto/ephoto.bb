SUMMARY = "EFL image viewer/editor/manipulator/slideshow creator"
DESCRIPTION = "Ephoto is an image viewer and editor. \
 \
Images can be viewed one at a time, in thumbnail groups, or as a slideshow. \
In terms of editing, images can be rotated/mirrored, cropped, colors be \
adjusted and artistic filters be applied."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ephoto-1.5-1.28.aarch64.rpm"
RPM_HASH = "57f72d1bd2e22738348e2bcf17d1662683c6f86605a8869a5f13c079c6a2defd1bd19d396efa6873ba0bc1f2a20f82ef9f41759829fbc715540de89d8f01e888"

RPROVIDES:${PN} += "ephoto"

RDEPENDS:${PN} += "efl \
elementary \
evas-generic-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecore-con.so.1 \
libecore-evas.so.1 \
libecore-file.so.1 \
libecore-ipc.so.1 \
libecore.so.1 \
libedje.so.1 \
libeet.so.1 \
libefreet.so.1 \
libeina.so.1 \
libeio.so.1 \
libelementary.so.1 \
libevas.so.1 \
libm.so.6"

inherit rpm
