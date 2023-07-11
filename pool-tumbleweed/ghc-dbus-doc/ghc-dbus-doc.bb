SUMMARY = "Haskell dbus library documentation"
DESCRIPTION = "This package provides the Haskell dbus library documentation."
LICENSE = "Apache-2.0"

PV = "1.2.29"

RPM_NAME = "ghc-dbus-doc-1.2.29-1.2.noarch.rpm"
RPM_HASH = "ad20cbf5c56b7ec2463d4dadfe3a5540493def5f3733833d3fc8c20d1d5d184333e2948b7c42b433bdef007de6abc43d97b2f7daa63bfa3b065adfcc8aae68ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dbus-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
