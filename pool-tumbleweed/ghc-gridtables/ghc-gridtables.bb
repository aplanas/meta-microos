SUMMARY = "Parser for reStructuredText-style grid tables"
DESCRIPTION = "Provides a parser for plain-text representations of tables. This package \
supports table headers, cells spanning multiple columns or rows, as well as a \
way to specfiy column alignments."
LICENSE = "MIT"

PV = "0.1.0.0"

RPM_NAME = "ghc-gridtables-0.1.0.0-1.4.aarch64.rpm"
RPM_HASH = "24896f200391cbacf14f4c45f25f029bd5e54da9f067fe4b4dfc1f8d65aa1e32af4a0ce1b6885393b031432a9ed6782c6432d8bbcd5714f93efe9f21b264817b"

RPROVIDES:${PN} += "ghc-gridtables \
libHSgridtables-0.1.0.0-Ih9NHzC29fxA826YvnxRsH-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdoclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc-ghc9.4.6.so \
libHSemojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsafe-0.3.19-9uHvZjuyLiR13wOGSONZxX-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
