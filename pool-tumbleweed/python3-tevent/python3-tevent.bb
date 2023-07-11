SUMMARY = "Python3 bindings for the Tevent library"
DESCRIPTION = "This package contains the python bindings for the Tevent library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.14.1"

RPM_NAME = "python3-tevent-0.14.1-2.2.aarch64.rpm"
RPM_HASH = "e746bc4ad93fe3d44a4c44301f57f871024b95de2b6aded0aa4ec071ccccd0c9c7be8428a915c97898beb72ee8f3596294fb842861bd9ec5d5386f59658897db"

RPROVIDES:${PN} += "python3-tevent"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtalloc.so.2 \
libtevent.so.0 \
libtevent0 \
python-abi"

inherit rpm
