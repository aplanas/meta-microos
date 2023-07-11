SUMMARY = "Keyboard Grabber Daemon"
DESCRIPTION = "kbdsniffd is a keyboard grabber daemon applications like screenreaders \
(sbl) can connect via network socket to the daemon and set a modifier \
key to enable the grabbing mode if the modifier key is pressed all \
key-strokes are send to the connected application this is useful if a \
blind user wants to use a screenreader without a braille display the \
grabbed keys can be used to trigger special screenreader functions"
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "kbdsniffd-0.6-28.10.aarch64.rpm"
RPM_HASH = "7c2e0b15188a0e7e8e218a26feb81063e019d018e36fa89695a6f55bedd2a35ffdcbca7f706ea3cf954bf8b38e2925a571922260d6f91bad36c242d4546ee287"

RPROVIDES:${PN} += "config-kbdsniffd \
kbdsniffd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
