SUMMARY = "Python 3 bindings for the createrepo_c library"
DESCRIPTION = "The Python 3 bindings for the createrepo_c library."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "python3-createrepo_c-0.20.1-3.2.aarch64.rpm"
RPM_HASH = "e4ad2e302d3c79782d6ffc770eeacf548ff10e413a80e7e5d779705d2161da5894a75990287e4a5cf2dcc2e663fd60a227f8465881cdbd561560247ab84363ab"

RPROVIDES:${PN} += "python3-createrepo-c \
python3.11dist-createrepo-c \
python3dist-createrepo-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcreaterepo-c.so.0 \
libcreaterepo-c0 \
libglib-2.0.so.0 \
libpython3.11.so.1.0 \
python-abi"

inherit rpm
