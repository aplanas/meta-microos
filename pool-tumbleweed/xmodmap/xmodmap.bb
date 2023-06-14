SUMMARY = "Utility to modify keymaps and pointer button mappings in X"
DESCRIPTION = "The xmodmap program is used to edit and display the keyboard modifier \
map and keymap table that are used by client applications to convert \
event keycodes into keysyms. It is usually run from the user's \
session startup script to configure the keyboard according to personal \
tastes."
LICENSE = "MIT"

PV = "1.0.11"

RPM_NAME = "xmodmap-1.0.11-1.4.aarch64.rpm"
RPM_HASH = "5c447bc3d0bd1004fa13808364774d3ccd29f2c1c875268de1b7c75b8757f359d7401fdeacba16ff600ab230c7549eda1e4233021b8d57170ca304da94e984f9"

RPROVIDES:${PN} += "xmodmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
