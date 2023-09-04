SUMMARY = "Free monads and monad transformers"
DESCRIPTION = "This package provides datatypes to construct Free monads, Free monad \
transformers, and useful instances. In addition it provides the constructs to \
avoid quadratic complexity of left associative bind, as explained in: \
 \
* Janis Voigtlander, /Asymptotic Improvement of Computations over Free Monads, \
MPC'08/."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-0.6.2-4.8.aarch64.rpm"
RPM_HASH = "b9e132c0e1e1985428b6ba77beeb53c5c6aaee9bb1fbb8f3cf58462bf38a159ec7d35b042c74d3739077bff682793732bee77ea111500b2ae39cb50e785bb3ee"

RPROVIDES:${PN} += "ghc-control-monad-free \
libHScontrol-monad-free-0.6.2-14mRW5Z3hOW3y0QtFAGsp6-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
