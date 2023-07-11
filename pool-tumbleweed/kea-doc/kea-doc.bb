SUMMARY = "Documentation for Kea"
DESCRIPTION = "This package contains the documentation for Kea."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-doc-2.2.0-2.6.noarch.rpm"
RPM_HASH = "8a0092ab9983a3423411a0460fd0a6a6472b5772bfc07dde140a309ec40ccf5396794cd2680546bb1e18ed94238c27232a315af2140d03a554124c54142a2e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kea-doc"

RDEPENDS:${PN} += ""

inherit rpm
