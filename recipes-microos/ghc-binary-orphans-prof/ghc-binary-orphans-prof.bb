SUMMARY = "Haskell binary-orphans profiling library"
DESCRIPTION = "This package provides the Haskell binary-orphans profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.4.1"

RPM_NAME = "ghc-binary-orphans-prof-1.0.4.1-1.2.aarch64.rpm"
RPM_HASH = "8a3387c649a7a5ddbfdf621d015c5d8d01d473309de1d6dc8827e81a2c575492e53804bd585830b162be6fbd421138b0a582d9c6225cb654f7600837ca4d8a93"

RPROVIDES:${PN} += "ghc-binary-orphans-prof ghc-binary-orphans-prof(aarch-64) ghc-prof(binary-orphans-1.0.4.1-B9MBRQ7HLuSFecvHRdMPIR)"
RDEPENDS:${PN} += "ghc-binary-orphans-devel ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(transformers-0.5.6.2)"

inherit rpm
