SUMMARY = "Default instances for types in dlist"
DESCRIPTION = "Default instances for types in dlist."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-dlist-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "515234bdf0c41fc9e430a20078aa540e082319b29794950c134fe12ea333af24abce8596113f3691bf1b1835eb926649248c5b6d5c8a7ba51a86c8a41d79c38d"

RPROVIDES:${PN} += "ghc-data-default-instances-dlist \
ghc-data-default-instances-dlist(aarch-64) \
libHSdata-default-instances-dlist-0.0.1-Bmo6e1Lr8bt987tygJ1EBf-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdlist-1.0-BmTLN13CmmLQvuHz7BjP9-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
