SUMMARY = "A sendto integration for Nemo"
DESCRIPTION = "This package add sendto integration for Nemo."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "nemo-extension-sendto-blueman-2.3.5-1.4.noarch.rpm"
RPM_HASH = "dd63b7228b5ef5df7deaa300d0a978b5235ef31f3d967bf8e1f7f4465b02d76fab14dc3e7dbc791bfcb270cce2b0f9cd44a280e6b50b2c56169d7ea0cdb23a91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-sendto-blueman"

RDEPENDS:${PN} += "blueman \
typelib-GObject \
typelib-Gio \
typelib-Nemo"

inherit rpm
