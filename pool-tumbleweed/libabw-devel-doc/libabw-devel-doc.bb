SUMMARY = "Documentation for the libabw API"
DESCRIPTION = "This package contains documentation for the libabw API."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-devel-doc-0.1.3-1.19.noarch.rpm"
RPM_HASH = "46c5b604f230ca7ea78e912c27e32442cbaa274fd2ce153811cd35fb4ab11b158098fa80697c1ff8bbe4ff2fba8a4aaa4d40751bc0649d10bd75e105ab79b8d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libabw-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
