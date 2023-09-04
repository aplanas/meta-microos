SUMMARY = "Haskell commonmark-pandoc profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-prof-0.2.1.3-2.10.aarch64.rpm"
RPM_HASH = "8eba7b51b456f85962189d7c357eec3a37120deb37925f5825f1be84760f7af21f2532633ce45e3ff06cf573a1dae3e9eab09c69ef9a10ea9d57e75d716d6cd7"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-prof \
ghc-prof-commonmark-pandoc-0.2.1.3-GkTisosgOerIgZW4ZPE6QD"

RDEPENDS:${PN} += "ghc-commonmark-pandoc-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-commonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR \
ghc-prof-commonmark-extensions-0.2.3.5-8zB7Un6TRyL3aLmtEaucGr \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-text-2.0.2"

inherit rpm
