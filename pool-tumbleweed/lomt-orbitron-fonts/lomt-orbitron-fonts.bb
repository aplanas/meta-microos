SUMMARY = "League Of Movable Type's 'Orbitron' font family"
DESCRIPTION = "Orbitron is a geometric sans-serif typeface intended for display \
purposes. It features four weights (light, medium, bold, and black), \
a stylistic alternative, small caps, and a ton of alternate glyphs."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-orbitron-fonts-0.20121218-8.7.noarch.rpm"
RPM_HASH = "9067abeacd08b6812beacd7b83146af98fa6a8b7a2b2bbe6ed92d1b75d9e328c674cb5c9f1da8ab133850b014dfbcd8e15bb45dd4844ebc7a3640702f18a223a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-orbitron-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
