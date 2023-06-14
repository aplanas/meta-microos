SUMMARY = "Thunar Plugin That Adds Context-menu Items from Dropbox"
DESCRIPTION = "Thunar Dropbox is a plugin for thunar that adds context-menu items from \
dropbox. This plugin does not come with dropbox itself, you will need \
to install that separately."
LICENSE = "GPL-3.0-only"

PV = "0.3.1"

RPM_NAME = "thunar-plugin-dropbox-0.3.1-1.14.aarch64.rpm"
RPM_HASH = "5a6057bb93e15140a1edf121b6059ade45eb756f125912dc48829e6a811f4769955bb9f93eaf44a3ec2c61c96ffffe74b6d3acc12dbbd2fc82147579d9b0eada"

RPROVIDES:${PN} += "thunar-dropbox \
thunar-plugin-dropbox"

RDEPENDS:${PN} += "dropbox \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libthunarx-3.so.0 \
thunar"

inherit rpm
