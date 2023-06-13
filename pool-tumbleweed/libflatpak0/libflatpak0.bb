SUMMARY = "OSTree based application bundle management library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "libflatpak0-1.14.4-1.2.aarch64.rpm"
RPM_HASH = "b6c36fc80f94004529c7d77e5810c7b98407046e40393177216788f496bfc84b5db98b73f801ec60b7d7a0a535d3fc62bed78f9b801aac1414b70a9966a2f02a"

RPROVIDES:${PN} += "libflatpak.so.0()(64bit) \
libflatpak0 \
libflatpak0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libXau.so.6()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libdconf.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libostree-1.so.1()(64bit) \
libseccomp.so.2()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libxml2.so.2()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
