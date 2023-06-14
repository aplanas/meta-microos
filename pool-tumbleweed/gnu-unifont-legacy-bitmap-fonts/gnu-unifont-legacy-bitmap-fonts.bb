SUMMARY = "The GNU Unicode Bitmap Font"
DESCRIPTION = "The GNU Unifont by Roman Czyborra is a free bitmap font that \
covers the Unicode Basic Multilingual Plane (BMP), using an \
intermediate bitmapped font format. \
 \
This package provides an old version of GNU unifont just for \
compatibility reasons."
LICENSE = "GPL-2.0+"

PV = "20080123"

RPM_NAME = "gnu-unifont-legacy-bitmap-fonts-20080123-1.17.noarch.rpm"
RPM_HASH = "a471a8559af0d3caa7168a9440d42fbcc8e21696fdecd2d82e5e2d212446c8055a0d22011e6a711bd3c9eda80a1e51c49f12426f7e611369f5d71f761f9ae7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-unifont \
gnu-unifont-legacy-bitmap-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
