SUMMARY = "Notifications Library -- Tools"
DESCRIPTION = "D-BUS notifications library. \
 \
This package contains the notify-send tool to create notifications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libnotify-tools-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "3aeddc854d8a895f3b72822a24e8ef438d2878af7350e71e43ac87c0053bbe4bb1cc80b28fee565ff4aac0c88b185e893f5611206d02479ff178f20e3c762201"

RPROVIDES:${PN} += "libnotify \
libnotify-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4"

inherit rpm
