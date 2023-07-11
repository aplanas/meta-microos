SUMMARY = "Javadoc for libbase"
DESCRIPTION = "Javadoc for libbase."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libbase-javadoc-1.1.6-1.5.noarch.rpm"
RPM_HASH = "8616371fe27c13818b4fd2fa03e154bc0b958cf6702a2165f50f122e8d44927951191dda8a75d5a347b259a23c8aa06d920e3fb5c58b27189e2f6824d3dec647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbase-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
