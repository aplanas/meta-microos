SUMMARY = "Free monads and monad transformers"
DESCRIPTION = "This package provides datatypes to construct Free monads, Free monad \
transformers, and useful instances. In addition it provides the constructs to \
avoid quadratic complexity of left associative bind, as explained in: \
 \
* Janis Voigtlander, /Asymptotic Improvement of Computations over Free Monads, \
MPC'08/."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-0.6.2-4.6.aarch64.rpm"
RPM_HASH = "2111388b8c0e81dd6c8e0437b65875c1bd580b35ec5c2d6db734ba40ff5f96af0baffb6956912816b99a697d7f4978085a83429152bdc89bb991c6c1f62301f4"

RPROVIDES:${PN} += "ghc-control-monad-free \
libHScontrol-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
