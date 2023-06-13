SUMMARY = "Documentation for the libstaroffice API"
DESCRIPTION = "This package contains documentation for the libstaroffice API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-devel-doc-0.0.7-3.9.noarch.rpm"
RPM_HASH = "d6dc25ae8b991355b0eff82a1a2bc2c69ced3fabbe7459987f2f75de61cb278548091ebc8b52a65dd3723a68b52b3c22a609dfc871b7cfdb8680902a3cd5f79f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstaroffice-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
