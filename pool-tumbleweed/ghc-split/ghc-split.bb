SUMMARY = "Combinator library for splitting lists"
DESCRIPTION = "A collection of various methods for splitting lists into parts, akin to the \
'split' function found in several mainstream languages. Here is its tale: \
 \
Once upon a time the standard 'Data.List' module held no function for splitting \
a list into parts according to a delimiter. Many a brave lambda-knight strove \
to add such a function, but their striving was in vain, for Lo, the Supreme \
Council fell to bickering amongst themselves what was to be the essential \
nature of the One True Function which could cleave a list in twain (or thrain, \
or any required number of parts). \
 \
And thus came to pass the split package, comprising divers functions for \
splitting a list asunder, each according to its nature. And the Supreme Council \
had no longer any grounds for argument, for the favored method of each was \
contained therein. \
 \
To get started, see the 'Data.List.Split' module."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-split-0.2.3.5-2.3.aarch64.rpm"
RPM_HASH = "05d7169a75e6e3e69745e6f9ce056ac6fac9790f6610f7a88500505e6630cc718a984da17f3faed178753f5df10dba32900e8ae65ab012e3ad801271e5ef670a"

RPROVIDES:${PN} += "ghc-split \
libHSsplit-0.2.3.5-J6pekuQs6yKFxqDJQyglHu-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
