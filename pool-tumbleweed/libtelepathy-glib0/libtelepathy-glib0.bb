SUMMARY = "GObject-based library for the Telepathy D-Bus API"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "libtelepathy-glib0-0.24.2-1.10.aarch64.rpm"
RPM_HASH = "5a9cc8f089ad85bed0bc408d9388d386d686011dab6e1904fdd65f93d4f1bb0fdaef111506040a32eaac1914470a7e412b9becfd14fc5a969c5b02184996c138"

RPROVIDES:${PN} += "libtelepathy-glib.so.0()(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.11)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.12)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.13)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.14)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.15)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.16)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.4)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.7)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.10)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.11)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.12)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.13)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.14)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.15)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.16)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.4)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.7)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.8)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.14.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.14.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.14.4)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.14.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.8)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.17.7)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.18.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.10)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.4)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.7)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.8)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.21.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.23.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.23.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.23.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.23.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.10)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.12)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.13)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.14)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.15)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.16)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.17)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.18)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.19)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.20)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.21)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.23)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.24)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.26)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.27)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.28)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.29)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.30)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.31)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.32)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.34)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.35)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.36)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.37)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.5)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.7)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.8)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.2)(64bit) \
libtelepathy-glib0 \
libtelepathy-glib0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
