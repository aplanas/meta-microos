SUMMARY = "Haskell refact library development files"
DESCRIPTION = "This package provides the Haskell refact library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-devel-0.3.0.2-4.3.aarch64.rpm"
RPM_HASH = "5a84162fe00265e40a8c1867c5e0227de44399bef7ec662e10606db082d892b1914ef6f98c3a50bf8b7354af5c5d882764f9c8d69c5746e7dcc6eb760f21229f"

RPROVIDES:${PN} += "ghc-devel-refact-0.3.0.2-BDNu2wr6P751Tb9dT06Yg8 \
ghc-refact-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-refact"

inherit rpm
