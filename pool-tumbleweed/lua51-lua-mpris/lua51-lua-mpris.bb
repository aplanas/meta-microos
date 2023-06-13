SUMMARY = "MPRIS api for lua"
DESCRIPTION = "MPRIS api for lua"
LICENSE = "MIT"

PV = "0.0+git20191025.2b12542"

RPM_NAME = "lua51-lua-mpris-0.0+git20191025.2b12542-4.1.aarch64.rpm"
RPM_HASH = "25cf9ef6d32cc177aade366fc698645c6c3a22c6d2cbfd9e5a90af8d4cdf6f9100d1cac01aefa49880a361062f9c1f58005a12cd3f010197e9eeab8b20506c51"

RPROVIDES:${PN} += "lua51-lua-mpris \
lua51-lua-mpris(aarch-64)"

RDEPENDS:${PN} += "lua51 \
lua51-lua-dbus"

inherit rpm
