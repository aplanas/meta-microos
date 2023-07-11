SUMMARY = "Haskell word8 library development files"
DESCRIPTION = "This package provides the Haskell word8 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-devel-0.1.3-5.6.aarch64.rpm"
RPM_HASH = "62c1a6e7115720ff097832ad5c493ad76b34a8ec30174abb6b4616aa52526afd366118ebe1e71ad3bfb023a45fa9b53e5fd84db33649dc7c1622885e54e46969"

RPROVIDES:${PN} += "ghc-devel-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-word8-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-word8"

inherit rpm
