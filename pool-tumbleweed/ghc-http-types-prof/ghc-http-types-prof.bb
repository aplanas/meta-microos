SUMMARY = "Haskell http-types profiling library"
DESCRIPTION = "This package provides the Haskell http-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-prof-0.12.3-6.6.aarch64.rpm"
RPM_HASH = "ab7a0d23877db8c55022d3de4f07b4a02b0c0c37a05de035937314b2488899ad85d795f2eba644c2503430c59063ee895300fedc0138cba45ecda4de1fd266f5"

RPROVIDES:${PN} += "ghc-http-types-prof \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6"

RDEPENDS:${PN} += "ghc-http-types-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-text-2.0.2"

inherit rpm
