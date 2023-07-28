SUMMARY = "Haskell clock library development files"
DESCRIPTION = "This package provides the Haskell clock library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-devel-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "d4c4b2ab1a2fbf842d3971c01d3fef8575db965155409b71c1d3f8ab685b45bfab208cf55946a1b5e61c9fed53aba538e249acc5d3b75c49cc62d6aea1338faf"

RPROVIDES:${PN} += "ghc-clock-devel \
ghc-devel-clock-0.8.4-Kk7SFw4SNhZ8ktwfjRIPil"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-clock \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
