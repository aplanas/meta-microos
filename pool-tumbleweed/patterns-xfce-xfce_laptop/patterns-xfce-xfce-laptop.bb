SUMMARY = "XFCE Laptop"
DESCRIPTION = "XFCE Laptop"
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_laptop-20230212-2.1.aarch64.rpm"
RPM_HASH = "95aae0d43e1b3e76c92f210a817509db9724f29fcbed15ca7a81e7755b941d3d0d8833c8b1c726c584fc7f37b070c04c33b7d26b2a27f83a567741ff7521a2d7"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-openSUSE-xfce-laptop \
patterns-xfce-xfce-laptop"

RDEPENDS:${PN} += "pattern-"

inherit rpm
