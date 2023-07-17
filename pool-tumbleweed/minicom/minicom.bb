SUMMARY = "A Terminal Program"
DESCRIPTION = "A terminal program similar to Telix(tm) (a program for calling other \
computers via modem) under MS-DOS. \
 \
If you want to access your modem with minicom, you have to be a member \
of the uucp group."
LICENSE = "GPL-2.0-or-later"

PV = "2.8"

RPM_NAME = "minicom-2.8-2.1.aarch64.rpm"
RPM_HASH = "42a8d771d9bd81f44bfa32c4524ff2a254efb7e1475b747c1ebc014e9a84f12601acd72de81729d86b85ae58e6224f2d946b18c3343e32ebbf0f06d87a4661c7"

RPROVIDES:${PN} += "minicom"

RDEPENDS:${PN} += "/usr/bin/sh \
ckermit \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
rzsz"

inherit rpm
