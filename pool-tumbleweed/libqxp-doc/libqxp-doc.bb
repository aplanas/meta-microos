SUMMARY = "Documentation of libqxp API"
DESCRIPTION = "The libqxp-doc package contains documentation files for libqxp."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libqxp-doc-0.0.2-1.20.noarch.rpm"
RPM_HASH = "f9364f9598fc9d87826f6051b29d0e050683db910b3435a6d5503be728cfebdc0f42543907c9a356df513ba8934a23a483bf8bcf708117cad525d8f8f8a3da81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqxp-doc"
RDEPENDS:${PN} += ""

inherit rpm
