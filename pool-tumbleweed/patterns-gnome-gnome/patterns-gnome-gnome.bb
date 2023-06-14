SUMMARY = "GNOME Desktop Environment (Wayland)"
DESCRIPTION = "The GNOME desktop environment is an intuitive and attractive desktop for users. \
This pattern installs components for GNOME to run with Wayland and X11 technologies."
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome-20201210-16.1.aarch64.rpm"
RPM_HASH = "c87b00918a86e4764f810d2f249e9fd6cdaf399e2e3047a9c0c31e27d3e46b4e73072e57aaf10a050d1f15dd661335b82eef075d130d47656bac4ea6a8f58310"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-gnome-gnome"

RDEPENDS:${PN} += "pattern-"

inherit rpm
