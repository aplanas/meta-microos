SUMMARY = "RRDtool header files"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package allow you to build programs making \
use of the library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-devel-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "c1411d43855dbfd03afdb42e1d5c93cd314bcaa36319818b6c80f2ae29e667da5986c34baf622be66760b0844c000f816bd885cf62d56730c4fc991e279dfd63"

RPROVIDES:${PN} += "pkgconfig(librrd) \
rrdtool-devel \
rrdtool-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librrd8"

inherit rpm
