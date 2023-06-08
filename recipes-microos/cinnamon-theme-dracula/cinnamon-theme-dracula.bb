SUMMARY = "Dracula Cinnamon themes"
DESCRIPTION = "This package contains the cinnamon themes for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "3.0+git94.9840b6b"

RPM_NAME = "cinnamon-theme-dracula-3.0+git94.9840b6b-1.1.noarch.rpm"
RPM_HASH = "d77ef66c0968f9cc3f8f6b84cb1db86da712e11c6661fdf6c951619d8d831d9c8c2199e063c51dca3c6932635e4b4fe3698d989c5b21c49b73fafb191764976e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-theme-dracula dracula-gtk-theme"
RDEPENDS:${PN} += "cinnamon metatheme-dracula-common"

inherit rpm
