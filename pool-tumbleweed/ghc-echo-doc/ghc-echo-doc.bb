SUMMARY = "Haskell echo library documentation"
DESCRIPTION = "This package provides the Haskell echo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-doc-0.1.4-2.3.noarch.rpm"
RPM_HASH = "c0b3e1aeb48986268a52b13197af79935c3e044c5b7a4d1a4f3a015320f157d3d709a17f71cbb34d7f995394e2645c5f50fb9c11622bdca716085dbc7fd02380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-echo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
