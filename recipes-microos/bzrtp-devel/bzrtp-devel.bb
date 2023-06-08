SUMMARY = "Development files for libbzrtp"
DESCRIPTION = "The libbzrtp development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libbzrtp."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "bzrtp-devel-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "80a96c03229230f39182ef65bb60d8ecc87ed3195801b49187150ce70a8b6d81f99b9d467730df1e0c0b4018cac904bd231a5eeb6e8129c9d2495c6ee90ab107"

RPROVIDES:${PN} += "bzrtp-devel bzrtp-devel(aarch-64) pkgconfig(libbzrtp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbzrtp0"

inherit rpm
