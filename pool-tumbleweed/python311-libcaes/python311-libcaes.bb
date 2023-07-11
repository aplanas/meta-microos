SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python311-libcaes-20230406-1.4.aarch64.rpm"
RPM_HASH = "3ea090eeefd68964d2416354a3d5410799c08dd9ce4dcb810b436d73e6e203642033be80c357a0aa9d05f3a9a5ef7ccad27420486ce3537df8deed08c0351c89"

RPROVIDES:${PN} += "python3-libcaes \
python311-libcaes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
python-abi"

inherit rpm
