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

RPM_NAME = "ghc-time-compat-1.9.6.1-5.9.aarch64.rpm"
RPM_HASH = "39c0641b3927fc8c9d96236d7d817e71097e7dd97955540e4861fa36818d2ebb978985d6df39035bdf8155826f55a7a15e19b735b4a841f5930954efaea87f61"

RPROVIDES:${PN} += "ghc-time-compat \
libHStime-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
