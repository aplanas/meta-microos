SUMMARY = "Layout table validator"
DESCRIPTION = "Layout table validator \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftvalid-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "4741571fd3ddbb1165e2b805f0bc528f4f548f8fa6753d75c9fcf10d54ab462af489b3b1810630542746a254c83dbd8b2c5196a68602fe58332c5745f2d17355"

RPROVIDES:${PN} += "ftvalid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
