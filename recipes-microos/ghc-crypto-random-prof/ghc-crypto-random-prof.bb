SUMMARY = "Haskell crypto-random profiling library"
DESCRIPTION = "This package provides the Haskell crypto-random profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-prof-0.0.9-5.3.aarch64.rpm"
RPM_HASH = "0c5b186b738b130b1f022d8c6b803c7835f6d7843b6eabc8f6ee559946c800df255ce9fa0bf19a0fd7fe5862c5767949538d7037c46febe4339c980306434be5"

RPROVIDES:${PN} += "ghc-crypto-random-prof ghc-crypto-random-prof(aarch-64) ghc-prof(crypto-random-0.0.9-JRbP8k0BmeXEHkvOdlpIfk)"
RDEPENDS:${PN} += "ghc-crypto-random-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(securemem-0.1.10-BbcWu3otOS6JQaPW3JfszZ) ghc-prof(unix-2.7.3) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
