SUMMARY = "Haskell deriving-aeson library documentation"
DESCRIPTION = "This package provides the Haskell deriving-aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-doc-0.2.9-2.2.noarch.rpm"
RPM_HASH = "0bf149ae137d21cfef94975e408893a4a084591e01e33cbf3c3969f263d3cf52f72e5d2cef60ce8d15a0cb492fde4cd9f481e5edee88a620db328c6152510fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deriving-aeson-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
