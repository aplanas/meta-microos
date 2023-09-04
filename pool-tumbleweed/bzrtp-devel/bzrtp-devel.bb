SUMMARY = "Development files for libbzrtp"
DESCRIPTION = "The libbzrtp development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libbzrtp."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "bzrtp-devel-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "f072c7288edf62f499c84cff02c5986405dee5ff7d51e0e34696e59431ce10aa2f225dbab82bedaa9da22744655e424eef8a8d57a8c30625f9ed52b5d14da25c"

RPROVIDES:${PN} += "bzrtp-devel \
pkgconfig-libbzrtp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbzrtp0"

inherit rpm
