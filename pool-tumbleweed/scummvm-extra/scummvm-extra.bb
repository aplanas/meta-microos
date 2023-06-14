SUMMARY = "Extra engines for ScummVM"
DESCRIPTION = "lastexpress and toltecs engines for ScummVM. \
These engines are in a worse state, but allow to play extra games."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "scummvm-extra-2.7.0-2.3.aarch64.rpm"
RPM_HASH = "158a9cc33374a20c82588b1fd4be7d3d24dac297513e278c63773061ab25de893ced29c34e35cf748570b63d485697e046539ac974c6a24c4377a3e86a9313d9"

RPROVIDES:${PN} += "liblastexpress.so \
libwintermute.so \
scummvm-extra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
scummvm"

inherit rpm
