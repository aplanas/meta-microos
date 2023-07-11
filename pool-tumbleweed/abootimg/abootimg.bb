SUMMARY = "Android boot image manipulator"
DESCRIPTION = "Android boot image manipulator. It can create/update/unpack boot.img - boot \
file used by Android OS."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "abootimg-0.6-9.9.aarch64.rpm"
RPM_HASH = "4da00e876df7dd3e762250c5df7510c5ff530a9f15f7365a3222b9530cadefb88861fd0fa7bd06a567bd5d72b74f0d43ce4b770091fc60e572741e7ee14fd91f"

RPROVIDES:${PN} += "abootimg"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6"

inherit rpm
