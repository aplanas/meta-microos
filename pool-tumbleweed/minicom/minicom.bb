SUMMARY = "A Terminal Program"
DESCRIPTION = "A terminal program similar to Telix(tm) (a program for calling other \
computers via modem) under MS-DOS. \
 \
If you want to access your modem with minicom, you have to be a member \
of the uucp group."
LICENSE = "GPL-2.0-or-later"

PV = "2.8"

RPM_NAME = "minicom-2.8-1.6.aarch64.rpm"
RPM_HASH = "fc4391fca0d1ca0a4c2e72ee52a3867acac5e47b4e2e46c52d0f878f57641e1b62dc3cbca6e99ea904ba6033cb6ef954a5d53afa6702c1b1afbb9b5e169c4185"

RPROVIDES:${PN} += "minicom"

RDEPENDS:${PN} += "/usr/bin/sh \
ckermit \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblockdev.so.1 \
libtinfo.so.6 \
rzsz"

inherit rpm
