SUMMARY = "Haskell safe library development files"
DESCRIPTION = "This package provides the Haskell safe library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-devel-0.3.19-4.8.aarch64.rpm"
RPM_HASH = "1cff62b6c9edce7c19bcd007784edd456bf4735a86f40a63bb6740abb6f4dad843dd19b838dbbd987ba099bc969957e66e73386041c2915e02eb48db3d16ab2b"

RPROVIDES:${PN} += "ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-safe-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-safe"

inherit rpm
