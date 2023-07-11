SUMMARY = "A Text Editor"
DESCRIPTION = "Joe is a powerful, easy to use, modeless text editor. It uses the same \
WordStar keybindings used in Borland's development environment."
LICENSE = "GPL-2.0-or-later"

PV = "4.6"

RPM_NAME = "joe-4.6-2.18.aarch64.rpm"
RPM_HASH = "0e1610778ad1f20feb439a2b00fc6169eefd1fe9849db1a9e1121b7633cf10b6012776207d870c8868092b80486c1e8029087df6e11955f84caffb184c4e0d9b"

RPROVIDES:${PN} += "config-joe \
joe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
