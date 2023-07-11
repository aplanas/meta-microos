SUMMARY = "Basic mpris player control for linux command line"
DESCRIPTION = "Minimalistic cli tool for controlling audio players exposing a MPRIS \
DBus interface, targeted at keyboard based WMs."
LICENSE = "MIT"

PV = "0.8.5"

RPM_NAME = "mpris-ctl-0.8.5-1.3.aarch64.rpm"
RPM_HASH = "2f549c840553f97e0d7f63e8bb26f41332ba5d3f7f297624d2fd6425d34094bc54d268ac47902459069d1fa5cd3ac449a300fded8ee7d29764b95c9254959213"

RPROVIDES:${PN} += "mpris-ctl"

RDEPENDS:${PN} += "libc.so.6 \
libdbus-1.so.3"

inherit rpm
