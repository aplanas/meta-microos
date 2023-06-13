SUMMARY = "Python 3 bindings for the createrepo_c library"
DESCRIPTION = "The Python 3 bindings for the createrepo_c library."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "python3-createrepo_c-0.20.1-3.1.aarch64.rpm"
RPM_HASH = "900438ea765540dd8d7002f12c94a7dbb189622a581550e306aef1f74cf31825b2d77f4eeaa01e61e58aa17819d7f0c47e1a56a02e2cac20df122c16914482fd"

RPROVIDES:${PN} += "python3-createrepo_c \
python3-createrepo_c(aarch-64) \
python3.10dist(createrepo-c) \
python3dist(createrepo-c)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcreaterepo_c.so.0()(64bit) \
libcreaterepo_c0(aarch-64) \
libglib-2.0.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
python(abi)"

inherit rpm
