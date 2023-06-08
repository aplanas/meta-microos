SUMMARY = "Deepin Style GTK Theme"
DESCRIPTION = "This package contains GTK+ themes for Deepin Desktop Environment."
LICENSE = "GPL-3.0+"

PV = "17.10.11"

RPM_NAME = "deepin-gtk-theme-17.10.11-1.6.noarch.rpm"
RPM_HASH = "b3da055b6698dcd4f6060c91f5c20dd6af45292dd07c4e59e303051717f7a1d125a735ec4032a89868f1730044d44b6fe5ba74a15f109f8fde10977811b64ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-gtk-theme"
RDEPENDS:${PN} += ""

inherit rpm
