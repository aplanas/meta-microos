SUMMARY = "Configuration panel for online accounts"
DESCRIPTION = "This package provides the online accounts onfiguration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-control-center-goa-44.2-1.1.noarch.rpm"
RPM_HASH = "6c7e2c737fdee19a24b8774e84ccda0f45a27ce13afd2bfc8c69fad950901adef067a95dca0b73fd15b9ed46104efeb2c0455dceb183b0e598e89cea19f355c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-goa"

RDEPENDS:${PN} += "gnome-control-center \
gnome-online-accounts"

inherit rpm
