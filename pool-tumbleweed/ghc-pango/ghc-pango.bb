SUMMARY = "Binding to the Pango text rendering engine"
DESCRIPTION = "This package provides a wrapper around the Pango C library that allows \
high-quality rendering of Unicode text. It can be used either with Cairo to \
output text in PDF, PS or other documents or with Gtk+ to display text \
on-screen."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-pango-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "403a50bba3239ac435be06ff9639d6366506ab48f06c6080fa3daed865fea2e1821e44d02f51eb2b8cc5f4fc3bcae3cf5c1b2d3ce9729b1a289b972206b7f03a"

RPROVIDES:${PN} += "ghc-pango \
libHSpango-0.13.8.2-AyE0ruIpbddIIASgXg66h2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScairo-0.13.8.2-84nOBKgVLz3788JDxxB5om-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSglib-0.13.8.2-DQyux8etmkJKUbOUWF524Z-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libz.so.1"

inherit rpm
