SUMMARY = "Tools for working with derived `Show` instances and generic inspection of values"
DESCRIPTION = "We provide a library and an executable for working with derived 'Show' \
instances. By using the library, we can parse derived 'Show' instances into a \
generic data structure. The 'ppsh' tool uses the library to produce \
human-readable versions of 'Show' instances, which can be quite handy for \
debugging Haskell programs. We can also render complex generic values into an \
interactive Html page, for easier examination."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-1.10-4.6.aarch64.rpm"
RPM_HASH = "cb19ee12868de6965e74c06bd62f21284b92c777f4953eb85c236517ba42c1a886794107b11efb24f2038754400d34117c4d96cf13098b8f0a0ca3cfa36c8ce2"

RPROVIDES:${PN} += "ghc-pretty-show \
libHSpretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShaskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
