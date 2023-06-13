SUMMARY = "Nemo overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nemo file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "nemo-extension-nextcloud-3.8.2-1.1.noarch.rpm"
RPM_HASH = "74674a98758bc21c155f0867a26aa8309f03e9c8f7cc5f44b41b2fae62c6a3499ef9319cc5c9f9f89b422f44f5e0ed9cbac4ca9be2f538ce473a60fc8485adc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-nextcloud"

RDEPENDS:${PN} += "nemo \
nextcloud-desktop \
python-nemo \
typelib(GObject) \
typelib(Nemo)"

inherit rpm
