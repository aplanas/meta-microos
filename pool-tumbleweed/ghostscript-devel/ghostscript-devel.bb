SUMMARY = "Development files for Ghostscript"
DESCRIPTION = "This package contains the development files for Ghostscript."
LICENSE = "AGPL-3.0-only"

PV = "9.56.1"

RPM_NAME = "ghostscript-devel-9.56.1-3.1.aarch64.rpm"
RPM_HASH = "b4104b39290854b2d02beb3b605046371746ed47a44702c80f4c7acdceca9fb9c33305ee0bb6ee777f906bee85b2312824807a42181e75a95765d9f3d9c630f3"

RPROVIDES:${PN} += "ghostscript-devel \
pkgconfig-ijs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ghostscript"

inherit rpm
