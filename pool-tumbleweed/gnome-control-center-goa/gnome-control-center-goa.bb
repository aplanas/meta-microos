SUMMARY = "Configuration panel for online accounts"
DESCRIPTION = "This package provides the online accounts onfiguration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "gnome-control-center-goa-44.3-1.1.noarch.rpm"
RPM_HASH = "95263567e7e6b17a7a16af61feca521a4289d0b4c89fcbc6a0cdcbbe56cdcccf9a708a16df044883cc71270eaf5c939f76c75221b3a8a5e8deaa8edd2dcbca73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-goa"

RDEPENDS:${PN} += "gnome-control-center \
gnome-online-accounts"

inherit rpm
