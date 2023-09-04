SUMMARY = "Documentation for the librvngabw API"
DESCRIPTION = "This package contains documentation for the librvngabw API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-devel-doc-0.0.3-2.1.noarch.rpm"
RPM_HASH = "8b16a6e511676de1b5a3bea0ad054274707e3b53c22125816cabb28433901a97b9a5866c08b20a0ecef6cbecd506ce0d8550f7458eaf02f06537555be731656e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librvngabw-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
