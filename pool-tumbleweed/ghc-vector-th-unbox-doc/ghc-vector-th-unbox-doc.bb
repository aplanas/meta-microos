SUMMARY = "Haskell vector-th-unbox library documentation"
DESCRIPTION = "This package provides the Haskell vector-th-unbox library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-vector-th-unbox-doc-0.2.2-4.3.noarch.rpm"
RPM_HASH = "5dafe436b63929866c267c28ffc0ce418b79b76a8a767f52a2cb90c2347958b25afae351d1ca5a1fbf7c9663ffc9e5f859f0104a962cdce863c080638790a47d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-th-unbox-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
