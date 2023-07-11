SUMMARY = "The bzip2 program and Library Documentation"
DESCRIPTION = "The bzip2 program and library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "bzip2-doc-1.0.8-5.5.noarch.rpm"
RPM_HASH = "79776f834d55543a27631cf6ac77defcd93a2f2764be6d8dc07737284806e0d0777750e54171e80a83dc78bc14ecdc3c3fe3a1a036b233ecc39e6ca6a7e8edac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bzip2-doc"

RDEPENDS:${PN} += ""

inherit rpm
