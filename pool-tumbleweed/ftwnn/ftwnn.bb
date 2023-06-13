SUMMARY = "Free tWnn Chinese Input System (Taiwan)"
DESCRIPTION = "Free tWnn Chinese input system (Taiwan)."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "ftwnn-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "ac4108e1bcff934aef08fe3f22fb62325a37084e07a80e063612529de8fe15516e5d53f1bebbe29a058eb66d1caa4ed0e976dccd5eef1e86bd78225e8552625d"

RPROVIDES:${PN} += "config(ftwnn) \
ftwnn \
ftwnn(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
fcwnn \
fcwnncom \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libwrap.so.0()(64bit) \
shadow"

inherit rpm
