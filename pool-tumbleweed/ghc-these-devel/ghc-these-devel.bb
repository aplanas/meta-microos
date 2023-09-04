SUMMARY = "Haskell these library development files"
DESCRIPTION = "This package provides the Haskell these library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "ghc-these-devel-1.2-1.7.aarch64.rpm"
RPM_HASH = "24cda906dfeba4b343ba32d2659ad8a56917260249186389d27f35595c0cfe1b575c829bbc98d34f0693bf6de2b98127d1b360a0565137773d30169a8eae0f1f"

RPROVIDES:${PN} += "ghc-devel-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-these-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-assoc-1.1-J44kuPbAMT5GyespKCFdbT \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-foldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-these"

inherit rpm
