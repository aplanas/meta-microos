SUMMARY = "RRDtool header files"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data (i.e. network bandwidth, machine-room temperature, \
server load average). This package allow you to build programs making \
use of the library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rrdtool-devel-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "1c285c04757a3e23c23f6079f31ac2924d2a1f3bd4b45d7ef855866dee33ea254340b8e96ba3b9ba412d0a5ff014388b92e1a709f302c7f175034cc277f0e33a"

RPROVIDES:${PN} += "pkgconfig-librrd \
rrdtool-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librrd8"

inherit rpm
