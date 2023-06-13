SUMMARY = "Documentation of libzmf API"
DESCRIPTION = "The libzmf-doc package contains documentation files for libzmf."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-devel-doc-0.0.2-1.44.noarch.rpm"
RPM_HASH = "b9e5a3c18a22b471266509c54c038e632acb59c68ca4a03579636061d867da89ea41dfeb8bdcc8503307924a1586270d8cbd9363956369e39fef3d26e8abd9e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libzmf-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
