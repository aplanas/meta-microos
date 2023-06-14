SUMMARY = "An HTTP client engine"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <http://www.stackage.org/package/http-client>."
LICENSE = "MIT"

PV = "0.7.13.1"

RPM_NAME = "ghc-http-client-0.7.13.1-3.4.aarch64.rpm"
RPM_HASH = "707e7303358daf01122950821e7e5abd0eb28ce28b272383417b6ff13c1ed42e7d76e8dce9273fe47f196eebdbac223e073ae822d309a6b6e71d31b5063323e8"

RPROVIDES:${PN} += "ghc-http-client \
libHShttp-client-0.7.13.1-zzcC5JvmJYD0Lc0D9h215-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSappar-0.1.8-JYpyJYPkUOgKorqU8WSWRv-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so \
libHSiproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd-ghc9.4.5.so \
libHSmime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHSstreaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
