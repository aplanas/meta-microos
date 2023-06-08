SUMMARY = "Haskell bitvec library development files"
DESCRIPTION = "This package provides the Haskell bitvec library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.4.0"

RPM_NAME = "ghc-bitvec-devel-1.1.4.0-1.3.aarch64.rpm"
RPM_HASH = "97c2b1f43ba0f8555bd780b183c97e954dcfb3897f61446f194136111a8a640b87d67db2561269f0d3cb045927d57dcf8fab4ecb71f9eea906381daa334680e7"

RPROVIDES:${PN} += "ghc-bitvec-devel ghc-bitvec-devel(aarch-64) ghc-devel(bitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy)"
RDEPENDS:${PN} += "/bin/sh ghc-bitvec ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(ghc-bignum-1.3) ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
