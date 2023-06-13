SUMMARY = "A Udev browsing tool"
DESCRIPTION = "It's easy to get lost in /sys and not much fun typing long udevadm info command lines all the time. \
This is a little UI for exploring the udev/sysfs tree: udev-browse. \
This provides a little bit simpler access to the device tree"
LICENSE = "LGPL-2.1+"

PV = "0.3"

RPM_NAME = "udev-browse-0.3-9.32.aarch64.rpm"
RPM_HASH = "3d1c5d448f8f8404c11541ef5ad2c43dbba569b20f31a04030a1be80d7c0a3d15d0a886bfef86f805af879d005d0efe415a5bbabbe33c6f1199cb14ee2abf757"

RPROVIDES:${PN} += "udev-browse \
udev-browse(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgee-0.8.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit)"

inherit rpm
