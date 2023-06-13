SUMMARY = "GNOME Desktop Environment (Basic)"
DESCRIPTION = "The GNOME desktop environment is an intuitive and attractive desktop for users. \
This pattern installs GNOME desktop environment with only essential graphical \
applications installed (File Manager, Web Browser)."
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_basic-20201210-16.1.aarch64.rpm"
RPM_HASH = "1dbff871a74076d06b0722a643be971d63e25b9125d3070d2d1195d5d684ff4614567f8f236e4594c1ca3b364d005e192baa4f89aa32a4fe8cc69b2a45ecd784"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-gnome-gnome_basic \
patterns-gnome-gnome_basic(aarch-64)"

RDEPENDS:${PN} += "gsettings-backend-dconf \
pattern()"

inherit rpm
