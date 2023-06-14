SUMMARY = "Convenient dbus api for lua"
DESCRIPTION = "lua-dbus is a convenient lua api for dbus"
LICENSE = "MIT"

PV = "0.0+git20170818.8fe38d0"

RPM_NAME = "lua51-lua-dbus-0.0+git20170818.8fe38d0-5.1.aarch64.rpm"
RPM_HASH = "1171c447c1be49fd5e71b372623f98882f71973865936c4a94f51deb266a92c633fc96ca47c68cc8dc6e6d00c0b818f435168667abe0066823fc8a08bf6c6605"

RPROVIDES:${PN} += "lua51-lua-dbus"

RDEPENDS:${PN} += "lua51 \
lua51-ldbus"

inherit rpm
