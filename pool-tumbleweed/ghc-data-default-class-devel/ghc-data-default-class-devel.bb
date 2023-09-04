SUMMARY = "Haskell data-default-class library development files"
DESCRIPTION = "This package provides the Haskell data-default-class library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-data-default-class-devel-0.1.2.0-10.3.aarch64.rpm"
RPM_HASH = "7711cca48a0a485a24c6f41907a887d6daa23668195351e34b09fdae9400677679d800fd3b86d7d5a995861b764fcc9d06a42a5998da906d14d69957d2e3f49a"

RPROVIDES:${PN} += "ghc-data-default-class-devel \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-default-class \
ghc-devel-base-4.17.2.0"

inherit rpm
