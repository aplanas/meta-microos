SUMMARY = "Tools for working with derived `Show` instances and generic inspection of values"
DESCRIPTION = "We provide a library and an executable for working with derived 'Show' \
instances. By using the library, we can parse derived 'Show' instances into a \
generic data structure. The 'ppsh' tool uses the library to produce \
human-readable versions of 'Show' instances, which can be quite handy for \
debugging Haskell programs. We can also render complex generic values into an \
interactive Html page, for easier examination."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-1.10-4.8.aarch64.rpm"
RPM_HASH = "1f2508adb133450c12a6d86ba8e6d8d79cdf5851a6f3d1cfd3f853d9f138152e347176827c1ef35c844b83f26bf18011e6e9d53f56b59d443ad38b24895a5e92"

RPROVIDES:${PN} += "ghc-pretty-show \
libHSpretty-show-1.10-FKBNqO5OmUpJSHpBLbk95K-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShaskell-lexer-1.1.1-C14Cmw3wUWQ88vb32sfZ2Z-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
