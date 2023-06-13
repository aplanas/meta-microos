SUMMARY = "Client Library for Communicating with GDM Greeter Server"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libgdm1-44.1-1.1.aarch64.rpm"
RPM_HASH = "6fbf1e324d7097df857349b19098a11b56fe689558ce0d6f9e8b5f8d46514cb7f09cd2eee0314762cad86ff30ba8d1b114da55e778ebdd06c70c188720d3b1fb"

RPROVIDES:${PN} += "libgdm.so.1()(64bit) \
libgdm1 \
libgdm1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gdm-schema \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
