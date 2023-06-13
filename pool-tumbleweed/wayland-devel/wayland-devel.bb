SUMMARY = "Development files for the Wayland Compositor Infrastructure"
DESCRIPTION = "Wayland is a protocol for a compositor to talk to its clients as well \
as a C library implementation of that protocol. The compositor can be \
a standalone display server running on Linux kernel modesetting and \
evdev input devices, an X application, or a wayland client itself. \
The clients can be traditional applications, X servers (rootless or \
fullscreen) or other display servers. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "wayland-devel-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "ba69710493289539938496e8dcd5bd6da883c53c2623cbadf405258ecb4198c7c7bb56e77fe79dcacbd81ffdab19c586be264721d3371a1a29eebd7225436042"

RPROVIDES:${PN} += "libwayland-egl-devel \
pkgconfig(wayland-client) \
pkgconfig(wayland-cursor) \
pkgconfig(wayland-egl) \
pkgconfig(wayland-egl-backend) \
pkgconfig(wayland-scanner) \
pkgconfig(wayland-server) \
wayland-devel \
wayland-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexpat.so.1()(64bit) \
libwayland-client0 \
libwayland-cursor0 \
libwayland-egl1 \
libwayland-server0 \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
pkgconfig(libffi) \
pkgconfig(wayland-client)"

inherit rpm
