SUMMARY = "Haskell tar library development files"
DESCRIPTION = "This package provides the Haskell tar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-devel-0.5.1.1-11.6.aarch64.rpm"
RPM_HASH = "eb91fbaff110cf78989e273418710dde7a8f7b485fc8118e7ba5101d398d478a972fdf52e1891a3ce820a62061f97f9009c47e12cfa08f7c2e3c4282198aa3df"

RPROVIDES:${PN} += "ghc-devel-tar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8 \
ghc-tar-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-tar"

inherit rpm
