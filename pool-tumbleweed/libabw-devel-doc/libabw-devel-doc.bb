SUMMARY = "Documentation for the libabw API"
DESCRIPTION = "This package contains documentation for the libabw API."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-devel-doc-0.1.3-1.18.noarch.rpm"
RPM_HASH = "943cc2962d68feb79bcae8a475ecb29a6233451d4683c48a6d0dcf7413e59a891bd11c9d89c04c84760ba0821705ee87968d21db07fa33ad5b21657577ecee58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libabw-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
