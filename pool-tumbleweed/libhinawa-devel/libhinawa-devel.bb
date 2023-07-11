SUMMARY = "Header files for libhinawa, a lib for IEEE 1394 async transactions"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libhinawa."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libhinawa-devel-2.4.0-1.7.aarch64.rpm"
RPM_HASH = "6419a6b9c0c53545e08da91ddc3f672293aa0bd338225b1d3536da8efa2f10796cf529504813a3699a06cf78e166e583c972df952826075637c099b4207d655e"

RPROVIDES:${PN} += "libhinawa-devel \
pkgconfig-hinawa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhinawa2 \
pkgconfig-gobject-2.0"

inherit rpm
