SUMMARY = "Platform independent system calls for Lua"
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
LICENSE = "MIT"

PV = "0.21"

RPM_NAME = "lua51-luasystem-0.21-5.2.aarch64.rpm"
RPM_HASH = "d58e50e09f1b641bd5f7b36d1d273f5ae463b1280067e88b6026e38dd0d66208b07f3f6c39ff02a9c55e232b33701584d8be2380802aac76f3817d85a5ec3c7d"

RPROVIDES:${PN} += "lua51-luasystem \
lua51-luasystem(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
lua51"

inherit rpm
