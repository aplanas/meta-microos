SUMMARY = "Unicode alternatives for common functions and operators"
DESCRIPTION = "This package defines new symbols for a number of functions, operators and types \
in the base package. \
 \
All symbols are documented with their actual definition and information \
regarding their Unicode code point. They should be completely interchangeable \
with their definitions. \
 \
For further Unicode goodness you can enable the 'UnicodeSyntax' language \
extension [1]. This extension enables Unicode characters to be used to stand \
for certain ASCII character sequences, i.e. &#x2192; instead of '->', &#x2200; \
instead of 'forall' and many others. \
 \
Original idea by P&#xE9;ter Divi&#xE1;nszky. \
 \
[1] \
<https://downloads.haskell.org/~ghc/latest/docs/html/users_guide/glasgow_exts.html#unicode-syntax>."
LICENSE = "BSD-3-Clause"

PV = "0.2.4.2"

RPM_NAME = "ghc-base-unicode-symbols-0.2.4.2-1.3.aarch64.rpm"
RPM_HASH = "bd154150564171d1448799a666536314c756921f40cd6b51bec6908bb4597f8093f70504bb86bb771b4b88e504c97bc737271d64152c7ce6d31bf4a603d77710"

RPROVIDES:${PN} += "ghc-base-unicode-symbols \
libHSbase-unicode-symbols-0.2.4.2-AsBlETXXS2UHsp6FZL7O0P-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
