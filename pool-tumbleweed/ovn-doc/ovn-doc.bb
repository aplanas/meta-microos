SUMMARY = "Open Virtual Network Documentation"
DESCRIPTION = "Contains additional documentation for OVN."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-doc-23.03.0-14.3.noarch.rpm"
RPM_HASH = "a6582fc245340b5beba2b2ac6693c9747d19107a78e462096e5ca89a4c0a50961b071622455989b9923c1f204155f70b65528b96c0eaf2f880ac54a46e092592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ovn-doc"

RDEPENDS:${PN} += ""

inherit rpm
