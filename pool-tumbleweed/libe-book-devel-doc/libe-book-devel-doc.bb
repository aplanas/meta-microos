SUMMARY = "Documentation for the libe-book API"
DESCRIPTION = "This package contains documentation for the libe-book API."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libe-book-devel-doc-0.1.3-2.21.noarch.rpm"
RPM_HASH = "1e9611fb36e4ed6c714633526b145f6b69ba6f6947428dcf93ad91a4b3059ce5439197aa8fea285d3410e993e837152f306f9b3d767a0947507288bf8444ff70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libe-book-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
