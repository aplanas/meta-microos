SUMMARY = "Fast Splittable PRNG"
DESCRIPTION = "Pure Haskell implementation of SplitMix described in \
 \
Guy L. Steele, Jr., Doug Lea, and Christine H. Flood. 2014. Fast splittable \
pseudorandom number generators. In Proceedings of the 2014 ACM International \
Conference on Object Oriented Programming Systems Languages & Applications \
(OOPSLA '14). ACM, New York, NY, USA, 453-472. DOI: \
<https://doi.org/10.1145/2660193.2660195> \
 \
The paper describes a new algorithm /SplitMix/ for /splittable/ pseudorandom \
number generator that is quite fast: 9 64 bit arithmetic/logical operations per \
64 bits generated. \
 \
/SplitMix/ is tested with two standard statistical test suites (DieHarder and \
TestU01, this implementation only using the former) and it appears to be \
adequate for 'everyday' use, such as Monte Carlo algorithms and randomized data \
structures where speed is important. \
 \
In particular, it __should not be used for cryptographic or security \
applications__, because generated sequences of pseudorandom values are too \
predictable (the mixing functions are easily inverted, and two successive \
outputs suffice to reconstruct the internal state)."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-0.1.0.4-4.3.aarch64.rpm"
RPM_HASH = "d81c465a60f8d3091d94255ceb35a1d079dec49ecb9e8a892fbcb0fce37913c11514513e1b1b09754e0234000d38f7f6fc40dbec0732c6f1ea165da3e743d01f"

RPROVIDES:${PN} += "ghc-splitmix \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
