SUMMARY = "Haskell easy-file library development files"
DESCRIPTION = "This package provides the Haskell easy-file library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-devel-0.2.5-1.5.aarch64.rpm"
RPM_HASH = "d5a650799f49ed6c6c5df91fec255f9f2502b350d2e5e74d59cbec1360531e513d926158e62d0115d3409b9cbe72c948fa65ba18cb0ba999a6962345c4412f07"

RPROVIDES:${PN} += "ghc-devel-easy-file-0.2.5-IptebCGkAyyEfjLBFFjLI \
ghc-easy-file-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-easy-file"

inherit rpm
