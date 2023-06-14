SUMMARY = "Lua bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Lua bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "lua-rrdtool-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "ba0f452ca794a01fea4bda025f57956ed0a8ece256ff1feb2c312a4b3b98d651e74380621d2dcfaff7013fa8ca9abf77953e9817c7d2eef282a1e06faa4b35ba"

RPROVIDES:${PN} += "lua-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
librrd.so.8 \
rrdtool"

inherit rpm
