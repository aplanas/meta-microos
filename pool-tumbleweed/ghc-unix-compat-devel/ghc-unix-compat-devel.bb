SUMMARY = "Haskell unix-compat library development files"
DESCRIPTION = "This package provides the Haskell unix-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-devel-0.6-3.8.aarch64.rpm"
RPM_HASH = "fe77136affb27feab140b01d01ac0e27da9e7b1dd2b60cab691f685998f7d9d3c21dc53471a9b104aeef0197e3d25bd0f1c96565ace3a4ca51337eea7c2b42bd"

RPROVIDES:${PN} += "ghc-devel-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-unix-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-unix-2.7.3 \
ghc-unix-compat"

inherit rpm
