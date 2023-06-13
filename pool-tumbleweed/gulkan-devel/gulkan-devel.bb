SUMMARY = "A GLib library for Vulkan abstraction"
DESCRIPTION = "A GLib library for Vulkan abstraction. It provides classes for handling Vulkan instances, devices, shaders and initialize textures GDK Pixbufs, Cairo surfaces and DMA buffers."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "gulkan-devel-0.15.2-1.4.aarch64.rpm"
RPM_HASH = "14e091b2fa41aaca31e74f3a37fab2fb610410f623ed026eccc8191b653a91995df42790777a16d1c4650f03e431184b4991d72be077a73acb26efbef49a2334"

RPROVIDES:${PN} += "gulkan-devel \
gulkan-devel(aarch-64) \
pkgconfig(gulkan-0.15)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gulkan0_15-0 \
pkgconfig(cairo) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(graphene-1.0) \
pkgconfig(vulkan)"

inherit rpm
