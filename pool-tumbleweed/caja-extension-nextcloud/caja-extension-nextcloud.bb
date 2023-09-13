SUMMARY = "Caja overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Caja file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "caja-extension-nextcloud-3.9.3-1.1.noarch.rpm"
RPM_HASH = "bd2f97b1682768e36da10a5c138b1dc61fdc710e6712756389bca17504805325eb7a957407409a275bc5b03bc7f6178303a15438b3dca24f35599ff8ec56bc41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-nextcloud"

RDEPENDS:${PN} += "caja \
nextcloud-desktop \
python-caja \
typelib-Caja \
typelib-GObject"

inherit rpm
