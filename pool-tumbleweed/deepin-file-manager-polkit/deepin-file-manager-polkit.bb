SUMMARY = "Deepin File polkit profiles"
DESCRIPTION = "This package provides polkit profiles for deepin-file-manager. These profiles \
are not adopted by security team. If you need the polkit feature, you should \
install them manually or use deepin-polkit-install package."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-polkit-5.6.4-3.7.noarch.rpm"
RPM_HASH = "1a83e72637b303359511929e3680536e8e53ccd7ea7b252a3a623d4596efcb2b307ff4df4550e6dfe9c0ed782fcd7a2d60c217957d910554fa11a9fdefc5d791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-file-manager-polkit"

RDEPENDS:${PN} += "deepin-file-manager"

inherit rpm
