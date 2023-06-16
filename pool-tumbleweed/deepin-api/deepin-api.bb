SUMMARY = "Go-lang bingding for dde-daemon"
DESCRIPTION = "The deepin-api is DDE API provides some dbus interfaces that is used for screen \
zone detecting, thumbnail generating, sound playing, etc."
LICENSE = "GPL-3.0+"

PV = "5.5.25"

RPM_NAME = "deepin-api-5.5.25-1.5.aarch64.rpm"
RPM_HASH = "28d9efe578fce5eff49f2cfc5671094f8bd917c4ed75d14acad662cfa09852e3147af23109dae414886e99d8010f47cf4507492ef36125d112089ebf32fd2125"

RPROVIDES:${PN} += "deepin-api"

RDEPENDS:${PN} += "/usr/bin/sh \
deepin-desktop-base \
rfkill"

inherit rpm
