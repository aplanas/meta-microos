SUMMARY = "Extract meta information from image files"
DESCRIPTION = "This module provides functions to extract various kinds of meta information \
from image files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.440.0"

RPM_NAME = "perl-Image-Info-1.440.0-1.1.noarch.rpm"
RPM_HASH = "06192dad9e7b61c44b457210c561f93eaff85759cbf80b05ac8b51794b749cc4caa77d345d38deb59e19157f094b940498bf0d2b9b553ec23d981422a1e39b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Bundle--Image--Info--Everything \
perl-Bundle--Image--Info--PNG \
perl-Bundle--Image--Info--SVG \
perl-Bundle--Image--Info--XBM \
perl-Bundle--Image--Info--XPM \
perl-Image--Info \
perl-Image--Info--AVIF \
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
