SUMMARY = "Translations for package deepin-screen-recorder"
DESCRIPTION = "Provides translations for the 'deepin-screen-recorder' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.11.6"

RPM_NAME = "deepin-screen-recorder-lang-5.11.6-1.6.noarch.rpm"
RPM_HASH = "5717f1a3bd572f9b67aecd80a676ecd7457dbd934ac0a519a73df339e153fe7f8a05ab5108f3e742e87e808796675f99add097d154cd04fd525452fae8a3d39f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-screen-recorder-lang deepin-screen-recorder-lang-all"
RDEPENDS:${PN} += "deepin-screen-recorder"

inherit rpm
