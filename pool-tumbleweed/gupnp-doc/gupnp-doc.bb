SUMMARY = "Documentation for gupnp"
DESCRIPTION = "Documentation for GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "gupnp-doc-1.6.3-3.1.noarch.rpm"
RPM_HASH = "784cadddbdfa58e23a25d2ce01658fc7e092e535e07932a6d6b56d41ee26be98934b89e7e6979b82e21ca77298b14c6b3b7eb3ab48c6d5f461152e262ee76e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gupnp-doc"

RDEPENDS:${PN} += ""

inherit rpm
