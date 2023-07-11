SUMMARY = "Lua bindings for RRDtool"
DESCRIPTION = "RRD is the Acronym for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package contains documentation on using RRD. \
 \
This package contains the Lua bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "lua-rrdtool-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "54cbfa1bd50950d4122a0bdade1b0b55ad7f44cbbaf3d4547d16aa7fad2f158dcf18d92f69707218e5616097bda70636e6e169ff998086a3b7b4f0432114e6cc"

RPROVIDES:${PN} += "lua-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
librrd.so.8 \
rrdtool"

inherit rpm
