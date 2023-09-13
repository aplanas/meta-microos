SUMMARY = "Documentation for dpic"
DESCRIPTION = " \
This package contains the documentation for dpic."
LICENSE = "BSD-2-Clause & CC-BY-3.0"

PV = "2023.02.01"

RPM_NAME = "dpic-doc-2023.02.01-2.1.noarch.rpm"
RPM_HASH = "dabd4f8322527fb4b6aa02f9e3c2e0023dddf06634b46abd4c32c6275b3f1e92f8efc8e753ab222fdb585e02f89db88c0eaee1da71e781bbe77f1babfb80b30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpic-doc"

RDEPENDS:${PN} += "dpic"

inherit rpm
