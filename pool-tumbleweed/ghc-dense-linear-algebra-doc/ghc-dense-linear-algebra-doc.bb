SUMMARY = "Haskell dense-linear-algebra library documentation"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-doc-0.1.0.0-3.6.noarch.rpm"
RPM_HASH = "b152114e8c0f268d49f500ee04deb2e7a5174d5ac5f1cf9b96d48c47a0c537402fa604d6672a6d323368e569d99c2d7958a74ada3ab2fe6a8449d61c6138a2c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dense-linear-algebra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
