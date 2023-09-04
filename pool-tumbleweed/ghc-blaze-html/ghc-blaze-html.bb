SUMMARY = "A blazingly fast HTML combinator library for Haskell"
DESCRIPTION = "A blazingly fast HTML combinator library for the Haskell programming language. \
The Text.Blaze module is a good starting point, as well as this tutorial: \
<http://jaspervdj.be/blaze/tutorial.html>."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-0.9.1.2-9.3.aarch64.rpm"
RPM_HASH = "e1252ebb64003b2a4919bd1914b75b6794ff1897722ad734f8104e233c9ebe646ee59308278fa32bc02f66afbe8226b684242350a25f100585b675ecc4691871"

RPROVIDES:${PN} += "ghc-blaze-html \
libHSblaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h-ghc9.4.6.so \
libHSblaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9-ghc9.4.6.so \
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
