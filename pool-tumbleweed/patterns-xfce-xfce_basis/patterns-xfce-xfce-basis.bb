SUMMARY = "XFCE Base System"
DESCRIPTION = "Base packages for the XFCE Desktop Environment"
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_basis-20230212-2.1.aarch64.rpm"
RPM_HASH = "02055c266ef5121222120f4157c839138ac52c2d80e02664dd8cec5f4be26ca2524a51418263dbda531519729872086a9df0e4090de4dd41e388a5a86c52fee7"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-openSUSE-xfce_basis \
patterns-xfce-xfce_basis \
patterns-xfce-xfce_basis(aarch-64)"

RDEPENDS:${PN} += "pattern() \
thunar \
thunar-volman \
xfce4-appfinder \
xfce4-notifyd \
xfce4-panel \
xfce4-power-manager \
xfce4-session \
xfce4-settings \
xfconf \
xfdesktop \
xfwm4"

inherit rpm
