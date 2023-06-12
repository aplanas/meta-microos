SUMMARY = "Documentation for qt6-coap in QCH format"
DESCRIPTION = "This package contains documentation for qt6-coap in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3993e80041f86df0b9f66992c7602f5918783c1ba6e67999432c611960f4b1fb055ae5778abe2e458ab964e6468500526ad5cab4b1fbc198bbd5f606758e908b"

RPROVIDES:${PN} += "qt6-coap-docs-qch \
qt6-coap-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
