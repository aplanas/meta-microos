SUMMARY = "array input schema for rime"
DESCRIPTION = "array input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-array-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "5bcffeba4ae9aa52d65bcc6827148f2a35bb6587614f01961e5892c60116ea8f10eb87da61a17780d554d6662cce47587000d0ed522efd981c9f64e45125f69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-array"

RDEPENDS:${PN} += ""

inherit rpm
