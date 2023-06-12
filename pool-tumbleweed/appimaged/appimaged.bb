SUMMARY = "Daemon handles (un)registering AppImages with the system"
DESCRIPTION = "appimaged is a daemon that handles registering and unregistering AppImages \
with the system (e.g., menu entries, icons, MIME types, binary delta updates, \
and such). \
 \
The package comes also with appimage.validate CLI tool to verify signature \
of AppImage files."
LICENSE = "MIT"

PV = "10"

RPM_NAME = "appimaged-10-1.9.aarch64.rpm"
RPM_HASH = "5f89a5ea6b85dda729f38122d6a449d52b38d5ca645a42ad19e28ddc89bc2fadb39c2c010bb36fd60f044e81b612d072348ff2f837459a8c17667522c6cc596a"

RPROVIDES:${PN} += "appimaged \
appimaged(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libinotifytools.so.0()(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libz.so.1()(64bit) \
zsync"

inherit rpm
