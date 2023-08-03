SUMMARY = "Documentation for the cfitsio library"
DESCRIPTION = "This package contains documentation for the cfitsio library."
LICENSE = "ISC"

PV = "4.3.0"

RPM_NAME = "cfitsio-devel-doc-4.3.0-1.1.noarch.rpm"
RPM_HASH = "1ccb73bc3cdb757b304b9bcf6b517eeb069889880c3dd078a82459bd2b7cb10d0db3e16d9b9409c0e747f15fd4841b7165f3fe71efd1d9fe6b236d115fdd5c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfitsio-devel-doc \
libcfitsio-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
