SUMMARY = "Client Library for Communicating with GDM Greeter Server"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libgdm1-44.1-2.1.aarch64.rpm"
RPM_HASH = "43ac80ff3e346740d6f5a0f980e0c0152e942ced13fd85c41ffb0a3bc1070fed9bcf05ab22706c92e50c4a80699a74430d1c13ddebdcd615b23295cfcf1fe6b7"

RPROVIDES:${PN} += "libgdm.so.1 \
libgdm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
gdm-schema \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
