SUMMARY = "Quake III"
DESCRIPTION = "Quake III first person shooter. This package only includes the binary \
files, you still need the data files from the original Quake III CD or \
the Demo."
LICENSE = "GPL-2.0-or-later"

PV = "1.36+git.20221123"

RPM_NAME = "ioquake3-1.36+git.20221123-1.3.aarch64.rpm"
RPM_HASH = "606ad3c3a9971bd28274ae54f184895bdc1b46b3e107303e9791c78cd004af0be03d15d8ba92165ad4d550df5749cede95b92aff82f7f227011cd89f84947f23"

RPROVIDES:${PN} += "ioquake3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
