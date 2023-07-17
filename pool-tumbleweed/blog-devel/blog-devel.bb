SUMMARY = "Provides library and header for boot logging"
DESCRIPTION = "The libaray and the header file for the FIFO interface used to build \
the LSB startproc command."
LICENSE = "GPL-2.0-or-later"

PV = "2.27"

RPM_NAME = "blog-devel-2.27-1.1.aarch64.rpm"
RPM_HASH = "44de6473e040bcf1d0393ecf0884047b34c2b0bb77dc3bd201794ca06f3f3e3f4ccd180cc31e6cf3d8208d1420a92b458f90bce7b9e25fcfc763f1e8643221b7"

RPROVIDES:${PN} += "blog-devel"

RDEPENDS:${PN} += "libblogger2"

inherit rpm
