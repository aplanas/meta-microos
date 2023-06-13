SUMMARY = "Tool to access image Exif metadata"
DESCRIPTION = "Exiv2 is a command line utility to access image metadata from tags like \
Exif."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.27.6"

RPM_NAME = "exiv2-0.27.6-3.3.aarch64.rpm"
RPM_HASH = "3839c580f78d03c850609bc7b46e3254b27975df0a0e4f45c8dd4eb46fa3e6fe1a691869637695b790c4d2b7d2b033e2519d8b7077b5efe68e8d6ad4d49b850d"

RPROVIDES:${PN} += "exiv2 \
exiv2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
