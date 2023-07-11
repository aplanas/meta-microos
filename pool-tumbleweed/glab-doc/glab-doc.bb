SUMMARY = "Documentation for GLab"
DESCRIPTION = "glab is a command line tool bringing GitLab's features to the command line."
LICENSE = "MIT"

PV = "1.31.0"

RPM_NAME = "glab-doc-1.31.0-1.1.noarch.rpm"
RPM_HASH = "780809519ab7d5f0d3ef50cc3f2ad4eb01df5eb4da93d13d037d6957ff639842632347d902c82a43db0e7798a035533e5ad8ab665ac115a9e6e71ff6990a3312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-doc"

RDEPENDS:${PN} += ""

inherit rpm
