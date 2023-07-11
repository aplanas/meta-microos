SUMMARY = "Documentation files for python-nss"
DESCRIPTION = "HTML Documentation and examples for python-nss."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python-nss-doc-1.0.1-6.1.noarch.rpm"
RPM_HASH = "277f1b8b202b12a2bb748a53bb9584d5117ddf6608bb39f6d41298006239cd8dedd7276aed1fc21de60b44b39652232f474ebe6c932e7e39dbcfc76d377ad8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-nss-doc"

RDEPENDS:${PN} += ""

inherit rpm
