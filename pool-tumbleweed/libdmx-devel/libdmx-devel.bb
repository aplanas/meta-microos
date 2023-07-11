SUMMARY = "Development files for the Distributed Multihead X extension library"
DESCRIPTION = "libdmx is an interface to the DMX extension for X, which allows a \
single server to be set up as a proxy spanning multiple servers -- \
not unlike Xinerama across discrete physical machines. It can be \
reconfigured on the fly to change the layout, and it is presented as \
a single logical display to clients. \
 \
This package contains the development headers for the library found \
in libdmx1."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libdmx-devel-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "35c015304dc706ed3320e525a6e5c1b355ca0d245e8f9d2b676850d706780886f62374835c8b8196cb7fcc223d858ec367c22234d31ce94988e8e5a7a8a2d0ec"

RPROVIDES:${PN} += "libdmx-devel \
pkgconfig-dmx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmx1 \
pkgconfig-dmxproto \
pkgconfig-x11 \
pkgconfig-xext"

inherit rpm
