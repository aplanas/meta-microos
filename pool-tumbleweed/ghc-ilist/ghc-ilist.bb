SUMMARY = "Optimised list functions for doing index-related things"
DESCRIPTION = "Optimised list functions for doing index-related things. They're faster than \
common idioms in all cases, they avoid \
<https://ghc.haskell.org/trac/ghc/ticket/12620 space leaks>, and sometimes they \
fuse better as well."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-ilist-0.4.0.1-1.2.aarch64.rpm"
RPM_HASH = "cd415ac8fb9a364da7c00b95e9b755b97a6302e38974257f29819c408f83bf24bb4890ed5587382953cffbb7d61da16a50a6b2e792f524789f505724cd0c1174"

RPROVIDES:${PN} += "ghc-ilist \
ghc-ilist(aarch-64) \
libHSilist-0.4.0.1-KsvLIKFcqVNEl2m4LjZZwM-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
