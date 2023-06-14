SUMMARY = "Client Library for Communicating with GDM Greeter Server"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libgdm1-44.1-1.1.aarch64.rpm"
RPM_HASH = "6fbf1e324d7097df857349b19098a11b56fe689558ce0d6f9e8b5f8d46514cb7f09cd2eee0314762cad86ff30ba8d1b114da55e778ebdd06c70c188720d3b1fb"

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
