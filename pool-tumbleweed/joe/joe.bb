SUMMARY = "A Text Editor"
DESCRIPTION = "Joe is a powerful, easy to use, modeless text editor. It uses the same \
WordStar keybindings used in Borland's development environment."
LICENSE = "GPL-2.0-or-later"

PV = "4.6"

RPM_NAME = "joe-4.6-2.17.aarch64.rpm"
RPM_HASH = "666fe0c904d1aebabe2bf99bf05ccf720f33fc761e04620ef399940c6d0c63c4cd9fc1deb5358b05f4a617a08c02d8a3404cc0aa2dfff678bdb9da9e6be58a17"

RPROVIDES:${PN} += "config(joe) \
joe \
joe(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
