SUMMARY = "Python 3 bindings for the librepo library"
DESCRIPTION = "This package provides the Python 3 bindings for the librepo library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "python3-librepo-1.15.1-1.4.aarch64.rpm"
RPM_HASH = "8ed405e4625e6f27de9ce3f6231acbbbaf968b569809e0e7e8d4e4715a3d0b15fa08c28668913c10a752b488fd8fe62f745bdf447368b31557155e8bdc298af4"

RPROVIDES:${PN} += "python3-librepo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpython3.10.so.1.0 \
librepo.so.0 \
librepo0 \
python-abi"

inherit rpm
