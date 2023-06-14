SUMMARY = "MPRIS api for lua"
DESCRIPTION = "MPRIS api for lua"
LICENSE = "MIT"

PV = "0.0+git20191025.2b12542"

RPM_NAME = "lua54-lua-mpris-0.0+git20191025.2b12542-4.1.aarch64.rpm"
RPM_HASH = "17c0e297d50726ffa3013caa1e794f57bf81d06068712c95a4f1ca7c7e7e4fa3a1bd8d89bd1f8cf7372594ab5f8e90ed1e76413be7b44f6de768952714e32384"

RPROVIDES:${PN} += "lua-lua-mpris \
lua54-lua-mpris"

RDEPENDS:${PN} += "lua54 \
lua54-lua-dbus"

inherit rpm
