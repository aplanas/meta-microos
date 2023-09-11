SUMMARY = "Haskell xml-hamlet library development files"
DESCRIPTION = "This package provides the Haskell xml-hamlet library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-devel-0.5.0.2-2.10.aarch64.rpm"
RPM_HASH = "57fb009ab95dfb84ef600569c4b7efe20938268539276258da7deae75531e88e248e9413aebf04e2a2d1d4ec48dbef300f59b2efa83e8d2bf9db398cacbaf4ec"

RPROVIDES:${PN} += "ghc-devel-xml-hamlet-0.5.0.2-BIJLiWudoZBIDguCKDu3nu \
ghc-xml-hamlet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-xml-hamlet"

inherit rpm
