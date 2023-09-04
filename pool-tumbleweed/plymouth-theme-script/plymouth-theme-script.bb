SUMMARY = "Plymouth 'Script' theme"
DESCRIPTION = "This package contains the 'script' boot splash theme for \
Plymouth. It is a simple example theme the uses the 'script' \
plugin."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-script-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "c8aa658e2de81adb4726a77ca2884154667d9736317fdbc5a47763e9c114e4b6e1eedfbb6ce95f628ebd00e5ad2c36b9418a726f83ad6ca91cecf8089a4c04f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-script"

RDEPENDS:${PN} += "plymouth-plugin-script \
plymouth-scripts"

inherit rpm
