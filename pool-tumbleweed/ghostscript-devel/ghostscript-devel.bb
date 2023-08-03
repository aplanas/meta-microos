SUMMARY = "Development files for Ghostscript"
DESCRIPTION = "This package contains the development files for Ghostscript."
LICENSE = "AGPL-3.0-only"

PV = "9.56.1"

RPM_NAME = "ghostscript-devel-9.56.1-5.1.aarch64.rpm"
RPM_HASH = "41958d2aea80079e01cdfcebf8bfe9e86f135cb345cc44a3b7ac0c64fb005c816fea89bccff2d7b068efa228555c6e32b04d6d5929ec6ef6bfa50f44b581c9df"

RPROVIDES:${PN} += "ghostscript-devel \
pkgconfig-ijs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ghostscript"

inherit rpm
