SUMMARY = "Development files for dav1d"
DESCRIPTION = "The dav1d-devel package contains libraries and header files for \
developing applications that use dav1d."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "dav1d-devel-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "65385bd3f9c50dc7d9e9c5741907738ea573d21825d9fed53d8b51138f84c8f78a7e6b8bd8cc0c3b1a72a184255f82a4461efd3d0f9ebd835445ff706e59489b"

RPROVIDES:${PN} += "dav1d-devel dav1d-devel(aarch-64) pkgconfig(dav1d)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdav1d6"

inherit rpm
