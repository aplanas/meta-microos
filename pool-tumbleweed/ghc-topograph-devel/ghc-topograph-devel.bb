SUMMARY = "Haskell topograph library development files"
DESCRIPTION = "This package provides the Haskell topograph library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-devel-1.0.0.2-2.3.aarch64.rpm"
RPM_HASH = "35163fd5abed42e6c438b6a708d9d5df1697c56ff748c91f3b2f381bc796f6242e3fe776c143009c1a571d51b6b1d8f9a2c6514f0b765e8acebbb71762d2d55c"

RPROVIDES:${PN} += "ghc-devel-topograph-1.0.0.2-I6mhBX3p9bHH2TZy30beYB \
ghc-topograph-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-containers-0.6.7 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-topograph"

inherit rpm
