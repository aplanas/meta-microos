SUMMARY = "Haskell easy-file library development files"
DESCRIPTION = "This package provides the Haskell easy-file library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-devel-0.2.5-1.3.aarch64.rpm"
RPM_HASH = "083e322f2c3532ea93e565501fcd3133a96e30bd4bde000f8d7bd8b6afe2a8f69bb57488b0883accf2d316637006e781a98620690939b94a25bbefdeb41d763c"

RPROVIDES:${PN} += "ghc-devel-easy-file-0.2.5-Eune3nGPx4BABAmiN3TyxF \
ghc-easy-file-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-easy-file"

inherit rpm
