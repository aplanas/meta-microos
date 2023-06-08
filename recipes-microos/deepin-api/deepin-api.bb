SUMMARY = "Go-lang bingding for dde-daemon"
DESCRIPTION = "The deepin-api is DDE API provides some dbus interfaces that is used for screen \
zone detecting, thumbnail generating, sound playing, etc."
LICENSE = "GPL-3.0+"

PV = "5.5.25"

RPM_NAME = "deepin-api-5.5.25-1.4.aarch64.rpm"
RPM_HASH = "68a460fdcabd7b6fd51a00559979973451807f8f945c3640b478eb64da3cef4a26e75e0aa42a18108295f02fa67fb728655282743b982b47d769271cc9ca7ad3"

RPROVIDES:${PN} += "deepin-api deepin-api(aarch-64)"
RDEPENDS:${PN} += "/bin/sh deepin-desktop-base rfkill"

inherit rpm
