SUMMARY = "Round Robin Database Tool to store and display time-series data"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). It stores the data in a compact way that will not \
expand over time, and it presents useful graphs by processing the data to \
enforce a certain data density. It can be used either via simple wrapper \
scripts (from shell or Perl) or via frontends that poll network devices and \
put a friendly user interface on it."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "2ffcfbce9cf6464e1f073a92d2c4bdfa0f8de3aebed8b7470cea577141e735d504dfdb819c31177f0d0749211a6e3dc9e495bba4b304b620ca42f5c846797f7e"

RPROVIDES:${PN} += "rrdtool"

RDEPENDS:${PN} += "dejavu \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
librrd.so.8"

inherit rpm
