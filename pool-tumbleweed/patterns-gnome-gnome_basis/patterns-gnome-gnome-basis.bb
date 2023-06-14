SUMMARY = "GNOME Base System"
DESCRIPTION = "Base packages for the GNOME desktop environment."
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_basis-20201210-16.1.aarch64.rpm"
RPM_HASH = "7da869696d3a5423842524afe6ed402bd8918a841eecdc08b24a56460534a79973f89cf85b61dbad57ff0986d3df3468804f70582c7477eb728adebd95dce75f"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
patterns-gnome-gnome-basis \
patterns-openSUSE-gnome-basis"

RDEPENDS:${PN} += "at-spi2-core \
gdm \
gnome-session \
pattern-"

inherit rpm
