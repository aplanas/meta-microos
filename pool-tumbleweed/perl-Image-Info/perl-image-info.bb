SUMMARY = "Extract meta information from image files"
DESCRIPTION = "This module provides functions to extract various kinds of meta information \
from image files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.43"

RPM_NAME = "perl-Image-Info-1.43-1.3.noarch.rpm"
RPM_HASH = "56e4a46ff58d87f54cbc4e7c4a93b97d1ade19fcddc92dab31d6ab5428a9699d60b2ad9406a2510ccc41847ce5f885d6dcc9b282fb3afb3a6e642626c50f94c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Bundle--Image--Info--Everything \
perl-Bundle--Image--Info--PNG \
perl-Bundle--Image--Info--SVG \
perl-Bundle--Image--Info--XBM \
perl-Bundle--Image--Info--XPM \
perl-Image--Info \
perl-Image--Info--BMP \
perl-Image--Info--GIF \
perl-Image--Info--ICO \
perl-Image--Info--JPEG \
perl-Image--Info--PNG \
perl-Image--Info--PPM \
perl-Image--Info--Result \
perl-Image--Info--SVG \
perl-Image--Info--SVG--XMLLibXMLReader \
perl-Image--Info--SVG--XMLSimple \
perl-Image--Info--TIFF \
perl-Image--Info--WBMP \
perl-Image--Info--WEBP \
perl-Image--Info--XBM \
perl-Image--Info--XPM \
perl-Image--TIFF \
perl-Image--TIFF--Rational \
perl-Image-Info"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
