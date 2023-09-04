SUMMARY = "Haskell strict library development files"
DESCRIPTION = "This package provides the Haskell strict library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-strict-devel-0.5-1.7.aarch64.rpm"
RPM_HASH = "c7639c35d474b960cc52415ff3a2132df7532dff3ac30774ff552c0cce28d21e37f3fefa665d688e07257846d1ae514e074cdca247127be1ef757967399780e2"

RPROVIDES:${PN} += "ghc-devel-strict-0.5-430Uicv2DUP1jZqwf2ycOP \
ghc-strict-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-assoc-1.1-J44kuPbAMT5GyespKCFdbT \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-text-2.0.2 \
ghc-devel-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-devel-transformers-0.5.6.2 \
ghc-strict"

inherit rpm
