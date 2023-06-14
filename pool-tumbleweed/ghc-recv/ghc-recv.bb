SUMMARY = "Efficient network recv"
DESCRIPTION = "Network recv based on buffer pools."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-0.1.0-1.3.aarch64.rpm"
RPM_HASH = "a498d65d250986569f7f10c9082882d3be6c81ce0cca643b72b2b3678f49393f9548d7bdceeef1c011c8e824f02ed4b33e275cf53b76368e140d7f0559576968"

RPROVIDES:${PN} += "ghc-recv \
libHSrecv-0.1.0-4koyrU2GJ4L4fpyKcXLbZR-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
