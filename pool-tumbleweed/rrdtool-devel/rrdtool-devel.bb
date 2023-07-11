SUMMARY = "RRDtool header files"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package allow you to build programs making \
use of the library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-devel-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "14a3d816724a4e905f08d66c70aea08bbeaa6576228f9093a14df8df24c0093aa06bbc5b7404197c955507fd5daa7317e88e752277a378b5f4b086eab582d333"

RPROVIDES:${PN} += "pkgconfig-librrd \
rrdtool-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librrd8"

inherit rpm
