SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-ppc64le-gcc13-icecream-backend-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "ef75071f1a049dced63b829d9ea1175d5616ad7f11ee40c899f906ac8d28b05a9ca6686420a109ac4959f8ad74ac6e67a043a0df9cd71ee3201567a94341d408"

RPROVIDES:${PN} += "cross-ppc64le-gcc13-icecream-backend \
cross-ppc64le-gcc13-icecream-backend(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
