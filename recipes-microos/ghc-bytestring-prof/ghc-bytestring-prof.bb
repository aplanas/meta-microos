SUMMARY = "Haskell bytestring profiling library"
DESCRIPTION = "This package provides the Haskell bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-prof-0.11.4.0-3.1.aarch64.rpm"
RPM_HASH = "a3c7963fb546666f9c39249702727327dbf1a4022071b9816b64c89d4ab5177e95b190da8ed84da6f8b5d2c9dac1c776408619cfaf5f9db6181990144b9ca8d9"

RPROVIDES:${PN} += "ghc-bytestring-prof ghc-bytestring-prof(aarch-64) ghc-prof(bytestring-0.11.4.0)"
RDEPENDS:${PN} += "ghc-bytestring-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(deepseq-1.4.8.0) ghc-prof(ghc-prim-0.9.0) ghc-prof(template-haskell-2.19.0.0)"

inherit rpm
