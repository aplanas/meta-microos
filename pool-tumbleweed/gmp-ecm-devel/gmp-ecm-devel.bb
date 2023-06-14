SUMMARY = "Development files for the gmp-ecm package"
DESCRIPTION = "This package contains header files required when building applications which \
use the libecm library."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "gmp-ecm-devel-7.0.5-1.3.aarch64.rpm"
RPM_HASH = "89f57215e781bc35629d79c5f355e69195337f11a8e70697a8f827e4a00b74b7d20116f7b8961c7d43a39e453c783b037901df36f8874a2b8b5ca18a889db312"

RPROVIDES:${PN} += "gmp-ecm-devel"

RDEPENDS:${PN} += "libecm1"

inherit rpm
