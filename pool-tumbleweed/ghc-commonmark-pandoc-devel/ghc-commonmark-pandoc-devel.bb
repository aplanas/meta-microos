SUMMARY = "Haskell commonmark-pandoc library development files"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-devel-0.2.1.3-2.10.aarch64.rpm"
RPM_HASH = "fc0252988b8c06314c1b1181a9279c5a8b886613449849a0ad421f0b4e99ec9726a5a042afdacd3b904583d0dc12f9e55ecae1ccdeac81fb939c7eea8f670727"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-devel \
ghc-devel-commonmark-pandoc-0.2.1.3-GkTisosgOerIgZW4ZPE6QD"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark-pandoc \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-commonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR \
ghc-devel-commonmark-extensions-0.2.3.5-8zB7Un6TRyL3aLmtEaucGr \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-text-2.0.2"

inherit rpm
