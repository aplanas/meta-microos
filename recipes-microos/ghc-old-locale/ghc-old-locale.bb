SUMMARY = "Locale library"
DESCRIPTION = "This package provides the ability to adapt to locale conventions such as date \
and time formats."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-1.0.0.7-13.2.aarch64.rpm"
RPM_HASH = "600d4bde0483bd06c3edbace115445b9e6094425729b9c4e0af011d3f1c0e02ffc34ee10e4a8c05ea2463679eb768e59956ff4c046e5359a06f42d6b8886f5ea"

RPROVIDES:${PN} += "ghc-old-locale ghc-old-locale(aarch-64) libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
