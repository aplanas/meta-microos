SUMMARY = "Use GHC call-stacks in a backward compatible way"
DESCRIPTION = "Use GHC call-stacks in a backward compatible way."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-0.4.0-2.3.aarch64.rpm"
RPM_HASH = "29b23ed5381aaebb9bd0acde589a99b6b2e616b9304c51de53bcd97764945bc53cbe694de2988e2d05bb96042011e61cd3420503f45f4e99bc3c7067e990348c"

RPROVIDES:${PN} += "ghc-call-stack \
ghc-call-stack(aarch-64) \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
