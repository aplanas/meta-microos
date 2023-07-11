SUMMARY = "Haskell criterion-measurement library documentation"
DESCRIPTION = "This package provides the Haskell criterion-measurement library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-doc-0.2.1.0-1.4.noarch.rpm"
RPM_HASH = "8264e6389cf9c985d71c239dea42786d1e2955327f8b35ca896bd517672c4bd6e0d25e8cc69201d77ba00eb2fc054c03633031bd12f2c4583abe6af3c07cdce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-criterion-measurement-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
