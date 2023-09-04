SUMMARY = "Lua bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Lua bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "lua-rrdtool-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "87db99427d79b2860e62b8e5ba5b0d99fa94adcfe1d8f5de086d03eee1b58787d2a17cf2e0baafa7644704ecfd6e644bf750eeb57bbb3adbe46e6fb3c6dc8b4e"

RPROVIDES:${PN} += "lua-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
librrd.so.8 \
rrdtool"

inherit rpm
