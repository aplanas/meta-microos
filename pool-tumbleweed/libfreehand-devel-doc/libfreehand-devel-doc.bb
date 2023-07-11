SUMMARY = "Documentation for the libfreehand API"
DESCRIPTION = "This package contains documentation for the libfreehand API."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-devel-doc-0.1.2-2.19.noarch.rpm"
RPM_HASH = "8674095613c572e6c2f9765196cb91e62cdf21817006386327bf284c84acf2963035944de015dfa355bc4b1ee827d04f05102de23122a5894cb57c3e2dd3cd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfreehand-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
