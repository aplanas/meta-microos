SUMMARY = "Upstream branding of lightdm-slick-greeter"
DESCRIPTION = "This package provides the upstream look and feel for \
lightdm-slick-greeter."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "lightdm-slick-greeter-branding-upstream-1.6.1-1.4.noarch.rpm"
RPM_HASH = "1c14acfe9f7ba959d0ca41eda880131f8cb60c6829df982125c58cb0f79f9c7067715342a53f0bbd867adc1b5930bb1bc8b1505654b1422b5b2a714604d4959d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-slick-greeter-branding \
lightdm-slick-greeter-branding-upstream"

RDEPENDS:${PN} += "gnome-icon-theme \
gtk3-metatheme-adwaita \
lightdm-slick-greeter \
ubuntu-fonts"

inherit rpm
