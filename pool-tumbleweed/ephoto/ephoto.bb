SUMMARY = "EFL image viewer/editor/manipulator/slideshow creator"
DESCRIPTION = "Ephoto is an image viewer and editor. \
 \
Images can be viewed one at a time, in thumbnail groups, or as a slideshow. \
In terms of editing, images can be rotated/mirrored, cropped, colors be \
adjusted and artistic filters be applied."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ephoto-1.5-1.29.aarch64.rpm"
RPM_HASH = "cd9ee673b41dd03baaf3090364ca796cfa17ab5ea0f33d92cea7ac0006b36b01e701993ab6ed0c07917e6a1e2766319c051c57a795630da8e5950f04edf6a5b2"

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
