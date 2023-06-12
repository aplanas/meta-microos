SUMMARY = "Ambiance Gtk Theme -- GTK+ 3 Support"
DESCRIPTION = "Includes an Ambiance light-on-dark theme. \
 \
Introduced as the default theme in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "gtk3-metatheme-ambiance-20.10-2.2.noarch.rpm"
RPM_HASH = "067838487356c140f795e015a06fdadebe37d509eb0b50e456a62b5a82bfba005be358ce8df155ee8691e80737418fa52ab886569ecd07c685b2c7ab39743b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-ambiance"
RDEPENDS:${PN} += "gtk3 \
metatheme-ambiance-common"

inherit rpm
