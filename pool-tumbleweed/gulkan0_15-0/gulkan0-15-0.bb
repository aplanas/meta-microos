SUMMARY = "A GLib library for Vulkan abstraction"
DESCRIPTION = "A GLib library for Vulkan abstraction. It provides classes for handling Vulkan instances, devices, shaders and initialize textures GDK Pixbufs, Cairo surfaces and DMA buffers."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "gulkan0_15-0-0.15.2-1.4.aarch64.rpm"
RPM_HASH = "03b5589e5d5e8908e1da414887df41b45dd062d371bd910c3b9c2c50bbe400fafca2dbf4b0cd82730b86667cf161c807f635b147d7ba61dedf76e851a4a589ff"

RPROVIDES:${PN} += "gulkan0-15-0 \
libgulkan-0.15.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglfw.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libjson-glib-1.0.so.0 \
libshaderc-shared.so.1 \
libvulkan.so.1"

inherit rpm
