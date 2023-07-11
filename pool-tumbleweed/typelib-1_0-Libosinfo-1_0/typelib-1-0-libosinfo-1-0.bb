SUMMARY = "Typelib files for libosinfo"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "typelib-1_0-Libosinfo-1_0-1.10.0-3.4.aarch64.rpm"
RPM_HASH = "1d606281fc44e6521671c2e3594e529fa28ae8d8179e7f366aa1ed25f4937f4fc3064b7a51985489ddd3fde3a5772b07bc4142a2e4492950273ca23bc416f2e3"

RPROVIDES:${PN} += "typelib-1-0-Libosinfo-1-0 \
typelib-Libosinfo"

RDEPENDS:${PN} += "libosinfo-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm
