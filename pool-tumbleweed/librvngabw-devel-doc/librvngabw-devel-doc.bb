SUMMARY = "Documentation for the librvngabw API"
DESCRIPTION = "This package contains documentation for the librvngabw API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-devel-doc-0.0.3-1.3.noarch.rpm"
RPM_HASH = "d04b807ce4dd3cd7d2830c46a0d30be705378804c73fb41d916dc14496400de80ed05a02902a023ab556983cfbe8248d1dbaf57566b07547f7fc8d71ad54ef82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librvngabw-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
