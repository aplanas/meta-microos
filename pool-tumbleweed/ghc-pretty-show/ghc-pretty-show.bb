SUMMARY = "Tools for working with derived `Show` instances and generic inspection of values"
DESCRIPTION = "We provide a library and an executable for working with derived 'Show' \
instances. By using the library, we can parse derived 'Show' instances into a \
generic data structure. The 'ppsh' tool uses the library to produce \
human-readable versions of 'Show' instances, which can be quite handy for \
debugging Haskell programs. We can also render complex generic values into an \
interactive Html page, for easier examination."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-1.10-4.3.aarch64.rpm"
RPM_HASH = "04e3448111121fc0c1e68d140a29f439f0c2949e885e83d9f6c07ada8b23e1bb229937d8bf303792498d3d51561eaf2fa514cdf807d61fe960f5a8bc2e6ae534"

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
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
