SUMMARY = "Documentation for the hawkey Python bindings"
DESCRIPTION = "This package provides the man pages for the hawkey Python bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.2"

RPM_NAME = "hawkey-man-0.70.2-1.1.noarch.rpm"
RPM_HASH = "37e29bf26dc8c88174ac59e54db60f64d342d77a0e025c03eea875cdbe85d44ed0d70b4ed6f842bb962c288beaf43ba21e299fc5670ada1e28b47d96d7f4b77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawkey-man"

RDEPENDS:${PN} += ""

inherit rpm
