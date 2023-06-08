SUMMARY = "Caja overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Caja file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.1"

RPM_NAME = "caja-extension-nextcloud-3.8.1-1.1.noarch.rpm"
RPM_HASH = "158bae00ce744f5c471073523369735c61dbf2113fca0e86da0aa9bc27b075d80949ba151a098c2d716b401fc6c188fff97721dd29696cdd3f1603fa7968a89e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-nextcloud"
RDEPENDS:${PN} += "caja nextcloud-desktop python-caja typelib(Caja) typelib(GObject)"

inherit rpm
