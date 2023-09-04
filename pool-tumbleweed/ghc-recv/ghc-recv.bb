SUMMARY = "Efficient network recv"
DESCRIPTION = "Network recv based on buffer pools."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-0.1.0-1.8.aarch64.rpm"
RPM_HASH = "c0c9556e113517443a03938a5623dc7c71b17ab35a6b9215c6b950b449c86482e2f1af3d3daac197fbe6eff7b4969a26bf3371f4b3cb9e900130be4dd609c6d3"

RPROVIDES:${PN} += "ghc-recv \
libHSrecv-0.1.0-E4Of8dJv2WfHRGIVsQUgMj-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
