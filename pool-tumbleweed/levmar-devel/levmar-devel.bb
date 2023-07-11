SUMMARY = "Development files for levmar library, and demo program"
DESCRIPTION = "Development files for the levmar library, and demo program."
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "levmar-devel-2.6-2.4.aarch64.rpm"
RPM_HASH = "beedf0c0fa3af29520bcb44136170b08ae42cca2efc89b37eab020aa33fc0e8f1c001478ea89d53f4bd6984af7fbfb19173b41c9a54ca4bfcd26b06633b1b263"

RPROVIDES:${PN} += "levmar-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblevmar.so.2 \
liblevmar2 \
libm.so.6"

inherit rpm
