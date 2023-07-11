SUMMARY = "FireHOL documentation"
DESCRIPTION = "Contains documentation and configuration examples for FireHOL."
LICENSE = "GPL-2.0-only"

PV = "3.1.7"

RPM_NAME = "firehol-doc-3.1.7-2.7.noarch.rpm"
RPM_HASH = "330cc82c01f41d1be41d60ed27a7474d4a2cdb4e1557f90c29a1198df70972acec532eb1b2270f462f952c4ec66c547a76fcd889636293d077f20471d5209af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firehol-doc"

RDEPENDS:${PN} += ""

inherit rpm
