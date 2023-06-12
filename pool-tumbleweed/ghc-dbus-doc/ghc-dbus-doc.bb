SUMMARY = "Haskell dbus library documentation"
DESCRIPTION = "This package provides the Haskell dbus library documentation."
LICENSE = "Apache-2.0"

PV = "1.2.28"

RPM_NAME = "ghc-dbus-doc-1.2.28-1.3.noarch.rpm"
RPM_HASH = "713799b881e43dd8bc3f079bcfc5fb901662f96a3a8982c45f493f355b5ef3d42d303f981072bf15a66e6cee6f5960ad0f9d25f00510a9486252b75098e8fc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dbus-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
