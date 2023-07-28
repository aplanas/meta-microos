SUMMARY = "Signed Distance Fields viewer"
DESCRIPTION = "Signed Distance Fields viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftsdf-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "39eeea2821fe933f6b47767f802ff32cc73e9b06973894eb5285bccfaa3418d168910b76308496104df4acd0621f5a7bf4fb5a46b8830daea96844a61035c178"

RPROVIDES:${PN} += "ftsdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
librsvg-2.so.2"

inherit rpm
