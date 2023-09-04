SUMMARY = "A blazingly fast markup combinator library for Haskell"
DESCRIPTION = "Core modules of a blazingly fast markup combinator library for the Haskell \
programming language. The Text.Blaze module is a good starting point, as well \
as this tutorial: <http://jaspervdj.be/blaze/tutorial.html>."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-0.8.2.8-6.3.aarch64.rpm"
RPM_HASH = "8ba570d49289a094eff528749097432036942a32ee4bcee7559e680ff5b8b131103f28086484d3e837f4dfb07532978286a2545816a88d255d1b458ddbd0500b"

RPROVIDES:${PN} += "ghc-blaze-markup \
libHSblaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
