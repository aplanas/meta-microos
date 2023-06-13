SUMMARY = "Development files for caja-sendto"
DESCRIPTION = "This package provides the functionality to the caja file browser to \
send files over e-mail or instant messaging protocols via Evolution, \
Empathy and Pidgin."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-sendto-devel-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "3fcb4afa7a19abe57ea47f99f9d762f70e2aeb67fcfefdbe7bb78d079e2f882c0d2bd630e447639b3d5f0efbf33421f9a7bf7447fab19ae9e95e069c4f4be4f8"

RPROVIDES:${PN} += "caja-extension-sendto-devel \
caja-extension-sendto-devel(aarch-64) \
caja-sendto-devel \
mate-file-manager-sendto-devel \
pkgconfig(caja-sendto)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
caja-extension-sendto \
caja-extension-sendto-pidgin \
caja-extension-sendto-upnp \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gtk+-3.0)"

inherit rpm
