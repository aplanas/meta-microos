SUMMARY = "Python 3 bindings for the librepo library"
DESCRIPTION = "This package provides the Python 3 bindings for the librepo library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "python3-librepo-1.15.1-1.6.aarch64.rpm"
RPM_HASH = "b48ca608b457cd87af809bd7c9ff8fb4909aa517610a357f62c217e859c19f581ae49cc5f9e5a61c5bb1a63579c12352759c13d8e00474412bb6a68d10a6ea62"

RPROVIDES:${PN} += "python3-librepo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpython3.11.so.1.0 \
librepo.so.0 \
librepo0 \
python-abi"

inherit rpm
