SUMMARY = "Header files for orcania"
DESCRIPTION = "Development and header files for orcania."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "orcania-devel-2.3.2-1.4.aarch64.rpm"
RPM_HASH = "ce576e3c7bc58d8496121098123b036ab56cd8db85b81a8bd1066b55bdc1f5493be1c7a857ab2d341223127cbb6b630bd0bbe9aca774eaddb66f6e4b63d70b4d"

RPROVIDES:${PN} += "cmake-Orcania \
orcania-devel \
pkgconfig-liborcania"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liborcania.so.2.3 \
liborcania2-3"

inherit rpm
