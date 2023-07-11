SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.16"

RPM_NAME = "libfwupd2-1.8.16-2.1.aarch64.rpm"
RPM_HASH = "dc6428be4ae580adb86d0d3e6ee645b2eae5b9acf7166fd28a0232f081250b1f580ea10cbba4ce334dd09f481bfcc1fcc0cee739810c3370bc537b965aaf4211"

RPROVIDES:${PN} += "libfwupd.so.2 \
libfwupd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
fwupd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjcat.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
