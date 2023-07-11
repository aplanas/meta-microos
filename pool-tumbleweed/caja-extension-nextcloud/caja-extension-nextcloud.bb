SUMMARY = "Caja overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Caja file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "caja-extension-nextcloud-3.9.0-3.1.noarch.rpm"
RPM_HASH = "c278f1bfde3bce40f4b0514270e82c3742b7b5a81247c6ab89eab169bdc9c46d6cbcd93e6344e39a42de189c787b0c102d8308ce62383a66044568a2329dc799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-nextcloud"

RDEPENDS:${PN} += "caja \
nextcloud-desktop \
python-caja \
typelib-Caja \
typelib-GObject"

inherit rpm
