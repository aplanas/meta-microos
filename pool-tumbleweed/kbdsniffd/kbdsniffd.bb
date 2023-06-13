SUMMARY = "Keyboard Grabber Daemon"
DESCRIPTION = "kbdsniffd is a keyboard grabber daemon applications like screenreaders \
(sbl) can connect via network socket to the daemon and set a modifier \
key to enable the grabbing mode if the modifier key is pressed all \
key-strokes are send to the connected application this is useful if a \
blind user wants to use a screenreader without a braille display the \
grabbed keys can be used to trigger special screenreader functions"
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "kbdsniffd-0.6-28.9.aarch64.rpm"
RPM_HASH = "856c2c3013e0d69dc45b3b2e801d903ab135893bd0c85d8ba2ebd50c936654a8dba8eeed958c73c0d55951f619ab3a4e8a9bbda1b85cceb561e843bcbad15bfa"

RPROVIDES:${PN} += "config(kbdsniffd) \
kbdsniffd \
kbdsniffd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
systemd"

inherit rpm
