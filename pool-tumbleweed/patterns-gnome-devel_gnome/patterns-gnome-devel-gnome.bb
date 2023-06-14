SUMMARY = "GNOME Development"
DESCRIPTION = "GNOME development packages."
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-devel_gnome-20201210-16.1.aarch64.rpm"
RPM_HASH = "7b4081ced923e6c6288f6634b12a8afa6e662023c5e1902eaf0fb824087968b8b665eb496bd1ce5ca0a1eb34b129a16b72a00cc17bd4af4f885d3f18ea295f6d"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-gnome-devel-gnome \
patterns-openSUSE-devel-gnome"

RDEPENDS:${PN} += "pattern-"

inherit rpm
