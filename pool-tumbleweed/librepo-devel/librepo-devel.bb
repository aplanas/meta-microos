SUMMARY = "Header files for the Repodata downloading library"
DESCRIPTION = "This package provides the development files for librepo."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "librepo-devel-1.15.1-1.6.aarch64.rpm"
RPM_HASH = "736ad1275bc13abe9fbd0232864244e7f84ed55366a50ed7028957fbfbd50de166387d0fc63b40da6499c91d7b33d3940118534b7c1b33585dee63837214b752"

RPROVIDES:${PN} += "librepo-devel \
pkgconfig-librepo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librepo0 \
pkgconfig-glib-2.0 \
pkgconfig-libcurl \
pkgconfig-libxml-2.0 \
pkgconfig-openssl"

inherit rpm
