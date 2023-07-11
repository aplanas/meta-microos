SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-epiphany-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "f09a6eead4050aed6261fd847a6f813b66b778be03779052342a7314113730e7682b55ba1790eac606ba2a6a5e6493a567e1845232d81a29fbc6a7de5adc5491"

RPROVIDES:${PN} += "cross-epiphany-gcc12 \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
