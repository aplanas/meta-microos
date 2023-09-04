SUMMARY = "Haskell lucid library documentation"
DESCRIPTION = "This package provides the Haskell lucid library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-doc-2.11.20230408-1.5.noarch.rpm"
RPM_HASH = "8c8b92a42b4c2102f81eab65766bfb1326c69fd65927eccff05ccd3f3f08d2b2842cde1be9e36578381aaeff81db7f3912c04319c4637f2fb56e02517d14eab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lucid-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
