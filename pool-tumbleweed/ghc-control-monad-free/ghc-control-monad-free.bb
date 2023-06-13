SUMMARY = "Free monads and monad transformers"
DESCRIPTION = "This package provides datatypes to construct Free monads, Free monad \
transformers, and useful instances. In addition it provides the constructs to \
avoid quadratic complexity of left associative bind, as explained in: \
 \
* Janis Voigtlander, /Asymptotic Improvement of Computations over Free Monads, \
MPC'08/."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-0.6.2-4.3.aarch64.rpm"
RPM_HASH = "ddc293c589c065d32d127ceb2dc64c0afd1a0d6edf0c58034200620ce432eaea1ab9d8cffc59835ef18657e2243218b8ba84bb338a1e35c2c54ced2885a44ff7"

RPROVIDES:${PN} += "ghc-control-monad-free \
ghc-control-monad-free(aarch-64) \
libHScontrol-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
