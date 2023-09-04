SUMMARY = "Haskell uuid-types profiling library"
DESCRIPTION = "This package provides the Haskell uuid-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-uuid-types-prof-1.0.5-5.4.aarch64.rpm"
RPM_HASH = "df1c64dbbe473f6ad03002c86e646f1a00c875c2321a52f49c59b86466a343f26e85cd11ed016c074851d979e92417f3ea85293cecc81c702f4f58b6deb2019b"

RPROVIDES:${PN} += "ghc-prof-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-uuid-types-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-uuid-types-devel"

inherit rpm
