SUMMARY = "Development files for libbzrtp"
DESCRIPTION = "The libbzrtp development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libbzrtp."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "bzrtp-devel-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "3f2d93ef4506dc64399d01ada730cfe5cb8b079ee636af54582c59a0c09f38c541effae79107b24df2e7ccc5c644f21e75ad749279a2e1d652bb46d88e6c83ef"

RPROVIDES:${PN} += "bzrtp-devel \
pkgconfig-libbzrtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbzrtp0"

inherit rpm
