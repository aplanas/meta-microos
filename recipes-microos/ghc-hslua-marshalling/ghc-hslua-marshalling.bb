SUMMARY = "Marshalling of values between Haskell and Lua"
DESCRIPTION = "Provides functions to marshal values from Haskell to Lua, and /vice versa/. \
 \
This package is part of HsLua, a Haskell framework built around the embeddable \
scripting language <https://lua.org Lua>."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "b36cc8452823f604db6c7a5ae076be35a6b574cbfe4003c83afb66406850527b3a6685d829aa34925067ad7012311f051c7fb3e1ef6e9a14a11ddb3a0ff94f52"

RPROVIDES:${PN} += "ghc-hslua-marshalling ghc-hslua-marshalling(aarch-64) libHShslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so()(64bit) libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
