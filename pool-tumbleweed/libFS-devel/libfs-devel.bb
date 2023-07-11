SUMMARY = "Development files for the X Font Service client library"
DESCRIPTION = "This library is used by clients of X Font Servers (xfs), such as \
xfsinfo, xfslsfonts, and the X servers themselves. \
 \
This package contains the development headers for the library found \
in libFS6."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libFS-devel-1.0.9-1.3.aarch64.rpm"
RPM_HASH = "cd27fbd2dc5b126679e0c6a46974d8095aa0c232b95d4821ead118c33864af398fb806419aa3179d01ca20c5fe75bb4bb4660ae77d7ed91ba17a623269d713e1"

RPROVIDES:${PN} += "libFS-devel \
pkgconfig-libfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libFS6 \
pkgconfig-fontsproto \
pkgconfig-xproto"

inherit rpm
