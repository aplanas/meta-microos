SUMMARY = "Compatibility package for time"
DESCRIPTION = "This packages tries to compat as much of 'time' features as possible. \
 \
/TODO:/ \
 \
* Difference type 'ParseTime' and 'FormatTime' instances are missing. \
 \
* Formatting varies depending on underlying 'time' version \
 \
* 'dayFractionToTimeOfDay' on extreme values."
LICENSE = "BSD-3-Clause"

PV = "1.9.6.1"

RPM_NAME = "ghc-time-compat-1.9.6.1-5.3.aarch64.rpm"
RPM_HASH = "13aaf90e4e8a483c620237bb80c7af952a2f206aa87d9aa71672af712593e9c4813d7250ef7064fe052d0c229f9f298bf000ad3511cbf971d37a47982388efff"

RPROVIDES:${PN} += "ghc-time-compat \
libHStime-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
