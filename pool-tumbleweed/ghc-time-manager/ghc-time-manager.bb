SUMMARY = "Scalable timer"
DESCRIPTION = "Scalable timer functions provided by a timer manager."
LICENSE = "MIT"

PV = "0.0.0"

RPM_NAME = "ghc-time-manager-0.0.0-5.2.aarch64.rpm"
RPM_HASH = "26123f84b4b8b407e4dd2690624788d04c3256867c62c228ce1d7f656f9f996d5af6fe10701966da8f33156716e470512d60cfa5b0c70718f086207a981f7f0b"

RPROVIDES:${PN} += "ghc-time-manager \
ghc-time-manager(aarch-64) \
libHStime-manager-0.0.0-49hD2RcPrUEG8anOiBePCj-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
