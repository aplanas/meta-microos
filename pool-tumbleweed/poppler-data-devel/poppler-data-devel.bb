SUMMARY = "Developer files for poppler-data"
DESCRIPTION = "This package contains the pkgconfig file for poppler-data."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only"

PV = "0.4.12"

RPM_NAME = "poppler-data-devel-0.4.12-1.1.noarch.rpm"
RPM_HASH = "666e562c9b4570356d791a9a11d8b5ee501348bd4fe090a776d52b5c2483d158f2bdca0d9eba1e2d173001ba97d2bbe5e8d1c7ad3c98f499d638402b147059a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(poppler-data) \
poppler-data-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
poppler-data"

inherit rpm
