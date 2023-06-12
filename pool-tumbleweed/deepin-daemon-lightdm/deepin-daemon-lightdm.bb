SUMMARY = "Deepin Desktop branding setting for lightdm"
DESCRIPTION = "Deepin Desktop branding setting for lightdm"
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-lightdm-5.14.45-2.4.aarch64.rpm"
RPM_HASH = "a60cf9e2db854737f13c43940b6545e4412caa8ae286b87e24105c429b895495e9be3dff76dde7002e92862557a603e2cb8813393ac2db1a46195d244ec29630"

RPROVIDES:${PN} += "deepin-daemon-lightdm \
deepin-daemon-lightdm(aarch-64)"
RDEPENDS:${PN} += "deepin-daemon \
lightdm"

inherit rpm
