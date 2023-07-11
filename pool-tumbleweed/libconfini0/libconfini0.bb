SUMMARY = "INI file parser library"
DESCRIPTION = "libconfini is a INI file parser library written in C."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.4"

RPM_NAME = "libconfini0-1.16.4-1.5.aarch64.rpm"
RPM_HASH = "db63f55c4cc3c89b051937f267b86f721c1227ad7e82dc965198627531688008e1594a3cd3787eaa990102209f3a0a80fb8942fbaa5e84caa6b11f11bc895d02"

RPROVIDES:${PN} += "libconfini.so.0 \
libconfini0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
