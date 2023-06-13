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
ghc-pretty-show(aarch-64) \
libHSpretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShaskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libatomic.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
