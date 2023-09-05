SUMMARY = "Headers for djvulibre libraries"
DESCRIPTION = "DjVuLibre is an implementation of DjVu, a Web-centric format and \
software platform for distributing documents and images. \
 \
This package contains the development files."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "libdjvulibre-devel-3.5.28-6.1.aarch64.rpm"
RPM_HASH = "935b05c4bb6724bd7a24afcd0bdd885856cb2ae8b3b153b993352c8b5bcdf87ee7472d31addc7e639c9bf96f8637cbd8083b5a61f74a6f5839fd363966fafa57"

RPROVIDES:${PN} += "libdjvulibre-devel \
pkgconfig-ddjvuapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdjvulibre21"

inherit rpm
