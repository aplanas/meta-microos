SUMMARY = "Haskell vector-binary-instances profiling library"
DESCRIPTION = "This package provides the Haskell vector-binary-instances profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-prof-0.2.5.2-5.2.aarch64.rpm"
RPM_HASH = "e259638284a65648f8e46c50e66d532dc326a3df9fe9e24670e5d1b1d19920fed0d8cd1efe133fd0857a565fe41aa52a0f56274c63da74bf73b0465e64c237c0"

RPROVIDES:${PN} += "ghc-prof(vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8) \
ghc-vector-binary-instances-prof \
ghc-vector-binary-instances-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-vector-binary-instances-devel"

inherit rpm
