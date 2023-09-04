SUMMARY = "Skein, a family of cryptographic hash functions.  Includes Skein-MAC as well"
DESCRIPTION = "Skein (<http://www.skein-hash.info/>) is a family of fast secure cryptographic \
hash functions designed by Niels Ferguson, Stefan Lucks, Bruce Schneier, Doug \
Whiting, Mihir Bellare, Tadayoshi Kohno, Jon Callas and Jesse Walker. \
 \
This package uses bindings to the optimized C implementation of Skein. \
We provide a high-level interface (see module 'Crypto.Skein') to some of the \
Skein use cases. We also provide a low-level interface (see module \
'Crypto.Skein.Internal') should you need to use Skein in a different way. \
 \
Currently we have support for Skein as cryptographic hash function as Skein as \
a message authentication code (Skein-MAC). For examples of how to use this \
package, see 'Crypto.Skein' module documentation. \
 \
This package includes Skein v1.3. Versions of this package before 1.0.0 \
implemented Skein v1.1."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-1.0.9.4-4.5.aarch64.rpm"
RPM_HASH = "ffe7f5ab3079e698eeba368fd0259b95469bfa41f7e026347e34b555e6b858fb1cd94f5418fe5ddfa7d8eac2f9e41edf3298db9944ffebe45bb17ef9f1bb10f8"

RPROVIDES:${PN} += "ghc-skein \
libHSskein-1.0.9.4-HfR9tmKKFFp5G94XUHSnaw-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScrypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSentropy-0.4.1.10-J8gEYIp8YzV1E0Yqy7gqyc-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
