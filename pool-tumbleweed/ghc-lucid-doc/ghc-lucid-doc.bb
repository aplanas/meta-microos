SUMMARY = "Haskell lucid library documentation"
DESCRIPTION = "This package provides the Haskell lucid library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-doc-2.11.20230408-1.6.noarch.rpm"
RPM_HASH = "b2eae9cd250a8f2da2ebb0bb72cded3bc08994673ecfe7bad27dbdb92112df488ee5e192de8892e74c962d0a55481b6a1ff9233e8435ef55bf87cb66e43790a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lucid-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
