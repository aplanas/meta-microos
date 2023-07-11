SUMMARY = "Utility to modify keymaps and pointer button mappings in X"
DESCRIPTION = "The xmodmap program is used to edit and display the keyboard modifier \
map and keymap table that are used by client applications to convert \
event keycodes into keysyms. It is usually run from the user's \
session startup script to configure the keyboard according to personal \
tastes."
LICENSE = "MIT"

PV = "1.0.11"

RPM_NAME = "xmodmap-1.0.11-1.5.aarch64.rpm"
RPM_HASH = "2177f2445cbdcd2117087a5c971bb18a016f510dfc53bf312b50d03a91ef10770e5fd9009f1d9ff52aef952d653706766f559cfe78cbbbb0f2ed5eccc09afe4e"

RPROVIDES:${PN} += "xmodmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
