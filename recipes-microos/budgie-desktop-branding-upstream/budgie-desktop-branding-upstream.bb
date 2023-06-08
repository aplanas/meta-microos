SUMMARY = "Upstream branding of the Budgie Desktop Environment"
DESCRIPTION = "This package provides the upstream look and feel for the Budgie \
desktop environment."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "20220829.3"

RPM_NAME = "budgie-desktop-branding-upstream-20220829.3-1.2.noarch.rpm"
RPM_HASH = "1ae98ec4619022ebdd54f8820fc132bd81f05d924e1901c26401a7d168c3bc014d8b700c8e4adb3d4724ea53a7fa5d6c6311600a41e2b34a71b92153356290aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-branding budgie-desktop-branding-upstream"
RDEPENDS:${PN} += "adwaita-icon-theme budgie-desktop materia-gtk-theme papirus-icon-theme"

inherit rpm
