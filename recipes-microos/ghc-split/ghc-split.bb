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

RPM_NAME = "ghc-split-0.2.3.5-2.2.aarch64.rpm"
RPM_HASH = "e466de6e6be01cc1a790a675ff22e4e671e67e2bd1aabef6b37a9508f82626a917a1079ce3446bbdffefdd772324c27e16f6bcbf8f985624973f019a9ba5eaa9"

RPROVIDES:${PN} += "ghc-split ghc-split(aarch-64) libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
