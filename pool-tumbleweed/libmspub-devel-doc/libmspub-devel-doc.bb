SUMMARY = "Documentation for the libmspub API"
DESCRIPTION = "This package contains documentation for the libmspub API."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libmspub-devel-doc-0.1.4-2.24.noarch.rpm"
RPM_HASH = "678b483ea220b0de1912b37e08a8794c2859882df96e2ad78ab01215ae54356b75a2669a315af0203a9775b0eec60a93f2917df563f2e0f333d25c930d4267aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmspub-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
