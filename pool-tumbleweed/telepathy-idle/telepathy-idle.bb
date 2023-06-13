SUMMARY = "IRC support for Telepathy"
DESCRIPTION = "Telepathy-idle provides IRC support for Telepathy."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.2"

RPM_NAME = "telepathy-idle-0.2.2-1.12.aarch64.rpm"
RPM_HASH = "7583d344a28d1bb0d5f5951dc0bd8aabfa0ce6d9776cdf4a74f351b7bc13a4a996eb4ccc873024a264623501ee61662d88d9922791cf0c455b09a8b5f5a0faa3"

RPROVIDES:${PN} += "telepathy-idle \
telepathy-idle(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtelepathy-glib.so.0()(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.11)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.13)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.14)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.16)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.11.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.10)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.13.8)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.6)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.15.8)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.19.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.1)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.10)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.14)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.15)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.18)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.2)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.20)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.21)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.24)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.26)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.27)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.29)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.3)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.31)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.36)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.9)(64bit) \
libtelepathy-glib.so.0(TELEPATHY_GLIB_0.9.2)(64bit)"

inherit rpm
