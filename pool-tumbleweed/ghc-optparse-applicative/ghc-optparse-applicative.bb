SUMMARY = "Utilities and combinators for parsing command line options"
DESCRIPTION = "Optparse-applicative is a haskell library for parsing options on the command \
line, and providing a powerful applicative interface for composing them. \
 \
optparse-applicative takes care of reading and validating the arguments passed \
to the command line, handling and reporting errors, generating a usage line, a \
comprehensive help screen, and enabling context-sensitive bash, zsh, and fish \
completions. \
 \
See the included README for detailed instructions and examples, which is also \
available on github <https://github.com/pcapriotti/optparse-applicative>."
LICENSE = "BSD-3-Clause"

PV = "0.17.0.0"

RPM_NAME = "ghc-optparse-applicative-0.17.0.0-2.3.aarch64.rpm"
RPM_HASH = "b4fd2d720f95d176a1b138dece3a8865f43bb144823fbe69d83686295b7938bc0213d42f247d8364d045ae2b190de42d129497e8a1086c815883b81936351529"

RPROVIDES:${PN} += "ghc-optparse-applicative \
libHSoptparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
libHSansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
