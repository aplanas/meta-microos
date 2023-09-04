SUMMARY = "Haskell data-default-class library documentation"
DESCRIPTION = "This package provides the Haskell data-default-class library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-data-default-class-doc-0.1.2.0-10.3.noarch.rpm"
RPM_HASH = "6e884df1790a5734088a89b0f7a94f67e9fe11b80e42d0a1abe3cfa25d890cebd6d36eedf797be4030b47da91ffe721cf314f4709e5be9d4a7f0cb9153fe2ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-class-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
