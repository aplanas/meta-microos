SUMMARY = "Runtime libraries for hwloc"
DESCRIPTION = "This package contains the run time libraries for hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "libhwloc15-2.9.0-3.1.aarch64.rpm"
RPM_HASH = "4c104dd2829010cf1d81d33278ecf700b1593aa2e0df1dcb4eda5c351ba405cfea18c893405b1332fd0ef9b5784d53bf1d3c9310db1d0061d34702df9612db53"

RPROVIDES:${PN} += "libhwloc.so.15 \
libhwloc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
hwloc-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpciaccess.so.0 \
libxml2.so.2"

inherit rpm
