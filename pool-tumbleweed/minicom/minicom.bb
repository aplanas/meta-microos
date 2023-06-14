SUMMARY = "A Terminal Program"
DESCRIPTION = "A terminal program similar to Telix(tm) (a program for calling other \
computers via modem) under MS-DOS. \
 \
If you want to access your modem with minicom, you have to be a member \
of the uucp group."
LICENSE = "GPL-2.0-or-later"

PV = "2.8"

RPM_NAME = "minicom-2.8-1.5.aarch64.rpm"
RPM_HASH = "11a12d3dbc2d90564ab6363f16f75cb49366bf6e8ac86112f5ece3b39b24402fd5107a3bd4dc73df01b8b9ac492f11d2bdd537f104a25ce3b4145a5ab6764519"

RPROVIDES:${PN} += "minicom"

RDEPENDS:${PN} += "/bin/sh \
ckermit \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblockdev.so.1 \
libtinfo.so.6 \
rzsz"

inherit rpm
