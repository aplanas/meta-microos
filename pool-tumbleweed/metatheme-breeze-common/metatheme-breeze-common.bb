SUMMARY = "GTK+ theme matching KDE's Breeze -- Common Files"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.7"

RPM_NAME = "metatheme-breeze-common-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "552d3d29dfb3a34e469bad108e649b9195e20b74af11cab65d1ad1f475323332ff9c4fdee088e0cbb0913754d6671a24ebe9ff87dbfdda2ffabbc0c01620770c"

RPROVIDES:${PN} += "breeze-gtk \
metatheme-breeze-common"

RDEPENDS:${PN} += ""

inherit rpm
