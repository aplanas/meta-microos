SUMMARY = "Documentation for gupnp"
DESCRIPTION = "Documentation for GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.4"

RPM_NAME = "gupnp-doc-1.6.4-2.1.noarch.rpm"
RPM_HASH = "44c5d76851cfbd7a79baecbe92aee95d8a1846cae2cec7fdc7f174cf644dc1f905d3cfb575c9cf4f9ccded8a6a41dbdbd35d938010ea24c3cda177aea412243f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gupnp-doc"

RDEPENDS:${PN} += ""

inherit rpm
