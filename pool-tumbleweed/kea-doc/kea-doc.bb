SUMMARY = "Documentation for Kea"
DESCRIPTION = "This package contains the documentation for Kea."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "kea-doc-2.4.0-1.1.noarch.rpm"
RPM_HASH = "754b332fc428e775a5975b73146e1ac781f070e10ad3ba2c9689ddc63e896ec74f97197ba7e5bde331955e10cf367f9d219d38f06b0356bdaab1ebc58bae8d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kea-doc"

RDEPENDS:${PN} += ""

inherit rpm
