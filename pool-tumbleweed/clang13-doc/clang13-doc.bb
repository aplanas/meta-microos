SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "clang13-doc-13.0.1-10.1.noarch.rpm"
RPM_HASH = "256d3a11be763bb729ce30f4d872c07e8f5c709b962ead60cedb9316a8e257e0795b76273096f516e921d75876e38c906e779a69c42cf9d3fafe251e56084644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang13-doc"

RDEPENDS:${PN} += ""

inherit rpm
