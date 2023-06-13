SUMMARY = "Haskell base-unicode-symbols library documentation"
DESCRIPTION = "This package provides the Haskell base-unicode-symbols library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-doc-0.2.4.2-1.2.noarch.rpm"
RPM_HASH = "e27435c2d8916f8fa1c39f0ea620fa1b485375169cada05fe56e8343c2c0eacfdfaa7adfe4e5c4266513a36611c16f77b1f4db0a951efc61dd60d9d966fa5dd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-unicode-symbols-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
