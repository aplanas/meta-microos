SUMMARY = "Header files for libtraceevent"
DESCRIPTION = "The package provides header and other needed development files for the library libtraceevent"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.7.3"

RPM_NAME = "libtraceevent-devel-1.7.3-1.1.aarch64.rpm"
RPM_HASH = "f9faf29fb77b6562b98ff16aed0aaf2e2f5776c1738a53581f5ce00cfd2d3c0be6b68da0e64ce582084bf77a4108645ad89843a33b7413275d52fb90fa79dd51"

RPROVIDES:${PN} += "libtraceevent-devel \
pkgconfig-libtraceevent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtraceevent1"

inherit rpm
