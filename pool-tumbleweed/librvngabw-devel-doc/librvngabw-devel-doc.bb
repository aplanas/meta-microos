SUMMARY = "Documentation for the librvngabw API"
DESCRIPTION = "This package contains documentation for the librvngabw API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-devel-doc-0.0.3-1.4.noarch.rpm"
RPM_HASH = "7af27825572c282a06f17b77615170fad356e89ecba194d97e82eebaa78b453711ad56789b90c7227f4f4be08b103948fb4e04f7b276d668f206b62f8c5fdded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librvngabw-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
