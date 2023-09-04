SUMMARY = "Development files for libreofficekit"
DESCRIPTION = "The libreofficekit-devel package contains libraries and header files for \
developing applications that use libreofficekit."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreofficekit-devel-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "30a6dbc0c23f8c073c554aead29d0bad984de096ea7b06f2e75b1ede55bd41691365bd249fe3d73f002c624df4f50a8066c72111488737fcb28148422bd484f8"

RPROVIDES:${PN} += "libreofficekit-devel"

RDEPENDS:${PN} += "libreofficekit"

inherit rpm
