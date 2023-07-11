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

RPM_NAME = "rrdtool-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "4b59f97813c6f331a6c834401fbe26a6ef60c5f664b8167945e1ac95b282dbe5e2eaf4368196f1a653c44fe7f7e20370896f6f46fca163d6039f367cee52ad5a"

RPROVIDES:${PN} += "rrdtool"

RDEPENDS:${PN} += "dejavu \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
librrd.so.8"

inherit rpm
