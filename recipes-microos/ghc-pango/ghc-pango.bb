SUMMARY = "Binding to the Pango text rendering engine"
DESCRIPTION = "This package provides a wrapper around the Pango C library that allows \
high-quality rendering of Unicode text. It can be used either with Cairo to \
output text in PDF, PS or other documents or with Gtk+ to display text \
on-screen."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-pango-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "403a50bba3239ac435be06ff9639d6366506ab48f06c6080fa3daed865fea2e1821e44d02f51eb2b8cc5f4fc3bcae3cf5c1b2d3ce9729b1a289b972206b7f03a"

RPROVIDES:${PN} += "ghc-pango ghc-pango(aarch-64) libHSpango-0.13.8.2-AyE0ruIpbddIIASgXg66h2-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScairo-0.13.8.2-84nOBKgVLz3788JDxxB5om-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSglib-0.13.8.2-DQyux8etmkJKUbOUWF524Z-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libglib-2.0.so.0()(64bit) libgmp.so.10()(64bit) libgobject-2.0.so.0()(64bit) libharfbuzz.so.0()(64bit) libm.so.6()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpng16.so.16()(64bit) libz.so.1()(64bit)"

inherit rpm
