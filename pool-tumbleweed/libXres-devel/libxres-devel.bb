SUMMARY = "Development files for the X Resource extension library"
DESCRIPTION = "libXRes provides an X Window System client interface to the Resource \
extension to the X protocol. The Resource extension allows for X \
clients to see and monitor the X resource usage of various clients \
(pixmaps, et al). \
 \
This package contains the development headers for the library found \
in libXRes1."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "libXres-devel-1.2.2-1.2.aarch64.rpm"
RPM_HASH = "56804e3dc97b85df3f53df41900755e8d2ca218f2f439c03f9e70af17fd1bde1dd6e8237be30435e6895aa1c138e32fbe24de7fc435dba760395f547737e2000"

RPROVIDES:${PN} += "libXres-devel \
pkgconfig-xres"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXRes1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xproto"

inherit rpm
