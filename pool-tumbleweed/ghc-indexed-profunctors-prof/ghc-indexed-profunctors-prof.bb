SUMMARY = "Haskell indexed-profunctors profiling library"
DESCRIPTION = "This package provides the Haskell indexed-profunctors profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-prof-0.1.1.1-1.2.aarch64.rpm"
RPM_HASH = "5ba46aa9064907f11b9eae64b18eaaab989a57a0693878d5be9ec98439370779b831962bfebd6e0f5876abf3438063884893247ee2cc7b45e642212030c81298"

RPROVIDES:${PN} += "ghc-indexed-profunctors-prof \
ghc-prof-indexed-profunctors-0.1.1.1-8VFnw8ahpDVCAreg6vEIe9"

RDEPENDS:${PN} += "ghc-indexed-profunctors-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
