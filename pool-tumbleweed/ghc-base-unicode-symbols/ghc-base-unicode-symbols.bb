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

RPM_NAME = "ghc-base-unicode-symbols-0.2.4.2-1.2.aarch64.rpm"
RPM_HASH = "f76f050e45e89acf62e6af9b454b37689771ec42a0f0658fca264578da4bdcc1a348a9e42f4f5b14b922578085e0e9a7af990fc7d794752697d573a95ea7885f"

RPROVIDES:${PN} += "ghc-base-unicode-symbols \
libHSbase-unicode-symbols-0.2.4.2-2uW4hd16ZmNBkWsH22htOC-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
