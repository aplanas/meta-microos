SUMMARY = "Tesseract Open Source OCR Engine Development files"
DESCRIPTION = "This package contains development files for the Tesseract Open Source OCR \
Engine."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "5.3.1"

RPM_NAME = "tesseract-ocr-devel-5.3.1-1.1.aarch64.rpm"
RPM_HASH = "f43cbeb9db9199e9daa895b15cbd673ca655ab3a60ca164a32061ace81f4f4944a5536949c9f32b2a0251e3c207f4cb915f01237ced86083fe1a322a3478a3bb"

RPROVIDES:${PN} += "pkgconfig-tesseract \
tesseract-ocr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtesseract5 \
pkgconfig-lept \
pkgconfig-libarchive"

inherit rpm
