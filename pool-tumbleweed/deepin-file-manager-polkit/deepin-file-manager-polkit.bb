SUMMARY = "Deepin File polkit profiles"
DESCRIPTION = "This package provides polkit profiles for deepin-file-manager. These profiles \
are not adopted by security team. If you need the polkit feature, you should \
install them manually or use deepin-polkit-install package."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-polkit-5.6.4-3.9.noarch.rpm"
RPM_HASH = "f835515e435678978fe68a93fc847a9f981c53c7d511034386c7499dcabebef47fd697bfda2393696541929b99fc5ca92211675212dea6130d21fe2796e464f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-file-manager-polkit"

RDEPENDS:${PN} += "deepin-file-manager"

inherit rpm
