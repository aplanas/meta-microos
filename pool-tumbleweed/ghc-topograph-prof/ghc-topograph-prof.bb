SUMMARY = "Haskell topograph profiling library"
DESCRIPTION = "This package provides the Haskell topograph profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-prof-1.0.0.2-2.3.aarch64.rpm"
RPM_HASH = "0e71b24850bfa8e3969c541d68be3b86f81af86dab5ce6ae899c169961437bcc23ae9f1a46105ac760538941171a6b5a1f851c3f2274e1866a949e3ec294ef2f"

RPROVIDES:${PN} += "ghc-prof-topograph-1.0.0.2-I6mhBX3p9bHH2TZy30beYB \
ghc-topograph-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-prof-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-prof-containers-0.6.7 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-topograph-devel"

inherit rpm
