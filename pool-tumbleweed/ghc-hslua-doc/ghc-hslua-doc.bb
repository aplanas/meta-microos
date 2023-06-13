SUMMARY = "Haskell hslua library documentation"
DESCRIPTION = "This package provides the Haskell hslua library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-doc-2.3.0-1.2.noarch.rpm"
RPM_HASH = "28be783787909bad933738a54035dd2cd2a52b7613c35678379f54c23ec01400afa31270321b651d748eed31f74059c1191b35ac3c583a1a31340252f259129f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
