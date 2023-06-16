SUMMARY = "Haskell language-javascript library development files"
DESCRIPTION = "This package provides the Haskell language-javascript library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.0"

RPM_NAME = "ghc-language-javascript-devel-0.7.1.0-4.3.aarch64.rpm"
RPM_HASH = "ed147cac830a00db6fdd422b1e1a83080413ec29e4b564139a69541d3de25031ae54e774a12cc3bcc54f5e725b318106577e05433f6c47a82bad1e889610c2c3"

RPROVIDES:${PN} += "ghc-devel-language-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM \
ghc-language-javascript-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-language-javascript"

inherit rpm
