SUMMARY = "Development files for GNU ocrad"
DESCRIPTION = "Development files for GNU ocrad - useful for programs implementing OCR."
LICENSE = "GPL-2.0-or-later"

PV = "0.28"

RPM_NAME = "ocrad-devel-0.28-1.7.aarch64.rpm"
RPM_HASH = "1dc8e681ea5bd1096ab92e0ac5fcbb40a5983e78e7ef0c4cbc425295bcdedd9646c28b5046aa6a3d3e08106e56be394683cb5b2d8260bcf50e1b78e05ff6a301"

RPROVIDES:${PN} += "ocrad-devel \
ocrad-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
