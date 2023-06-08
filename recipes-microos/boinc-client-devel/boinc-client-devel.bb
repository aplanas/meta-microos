SUMMARY = "Development files for libboinc"
DESCRIPTION = "This package contains development files for libboinc."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.0"

RPM_NAME = "boinc-client-devel-7.22.0-1.4.aarch64.rpm"
RPM_HASH = "73c9f17a1bf2097a3123943f016f08d518325b0e6bb4c95fdcfdaf7598008125d88c88fb90c25ef256cd15fa76771dd31ec1ae2c4a7953fb6ff486ce50c9b875"

RPROVIDES:${PN} += "boinc-client-devel boinc-client-devel(aarch-64) libboinc-devel pkgconfig(libboinc) pkgconfig(libboinc_api) pkgconfig(libboinc_crypt) pkgconfig(libboinc_graphics2) pkgconfig(libboinc_opencl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libboinc7 openssl-devel pkgconfig(libjpeg) pkgconfig(openssl)"

inherit rpm
