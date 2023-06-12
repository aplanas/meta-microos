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

RPM_NAME = "ghc-skein-1.0.9.4-4.2.aarch64.rpm"
RPM_HASH = "3d89b79fbdb5dbc58d9b9b31599012ad1442f1b12ade2187ef6838d2e97e66e0d848cb7fe2046a0aace635d4b857f3774336473c110693df963eda416ca8a6eb"

RPROVIDES:${PN} += "ghc-skein \
ghc-skein(aarch-64) \
libHSskein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHScrypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSentropy-0.4.1.10-HkaMHQZP8nyRj15panvtP-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
