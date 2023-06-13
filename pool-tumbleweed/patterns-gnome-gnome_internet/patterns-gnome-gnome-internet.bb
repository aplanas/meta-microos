SUMMARY = "GNOME Internet"
DESCRIPTION = "GNOME Internet Applications"
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_internet-20201210-16.1.aarch64.rpm"
RPM_HASH = "c826e88f36c519e6d0fe2a37a12cf0ccacc44f5dc1b423bcb0973a33e90ecdf2866dcd5b4248fa2911fe5769c0dcbbbe9a328d404cf4c28d99d01d054ca3fef6"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-gnome-gnome_internet \
patterns-gnome-gnome_internet(aarch-64) \
patterns-openSUSE-gnome_internet"

RDEPENDS:${PN} += ""

inherit rpm
