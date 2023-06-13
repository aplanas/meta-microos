SUMMARY = "The D-Bus responder of sssd"
DESCRIPTION = "Provides the D-Bus responder of sssd, called InfoPipe, which allows \
information from sssd to be transmitted over the system bus."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-dbus-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "228e1e869e1d7c372cf6c789e79049085ed6ca0aa1b64e0fbcabd687a572a2448fe196b5b9e13f7fd4c0494b41884752fff097fc4216e856160f9e3d20e0f1cb"

RPROVIDES:${PN} += "sssd-dbus \
sssd-dbus(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdhash.so.1()(64bit) \
libifp_iface.so()(64bit) \
libldb.so.2()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libselinux.so.1()(64bit) \
libsss_cert.so()(64bit) \
libsss_child.so()(64bit) \
libsss_debug.so()(64bit) \
libsss_iface.so()(64bit) \
libsss_sbus.so()(64bit) \
libsss_util.so()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtalloc.so.2()(64bit) \
libtdb.so.1()(64bit) \
libtevent.so.0()(64bit) \
sssd"

inherit rpm
