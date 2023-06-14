SUMMARY = "Haskell commonmark library development files"
DESCRIPTION = "This package provides the Haskell commonmark library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-commonmark-devel-0.2.2-2.3.aarch64.rpm"
RPM_HASH = "b8898fd6d5f19143f718fb7a672bda8d37b7b03399d352d2b74ba501dd2f43c978146db374d320dec1bd98cb1364e630e3b6975e96ea828cd39f68b16a88e0b3"

RPROVIDES:${PN} += "ghc-commonmark-devel \
ghc-devel-commonmark-0.2.2-3PrTrnYGJolB2uRqWVubZz"

RDEPENDS:${PN} += "/bin/sh \
ghc-commonmark \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO \
ghc-devel-unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO"

inherit rpm
