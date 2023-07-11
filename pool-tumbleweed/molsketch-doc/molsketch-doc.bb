SUMMARY = "Documentation for molsketch"
DESCRIPTION = "2D molecular structures editor. \
 \
Help documentation for molsketch."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "molsketch-doc-0.7.3-1.4.noarch.rpm"
RPM_HASH = "962500ad802e918c76b785d0310215efd00a18e786ebe51d39a7199567e08580be3231cf0a35ff9451854fd2b5195d9b02c45f0faa36a998d64b398fade52301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molsketch-doc"

RDEPENDS:${PN} += ""

inherit rpm
