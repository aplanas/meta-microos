SUMMARY = "Socks proxy (ver 5)"
DESCRIPTION = "Socks proxy (version 5) implementation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-0.6.1-6.9.aarch64.rpm"
RPM_HASH = "fd10d2099a823cb27f7119a31e91e83bff4ea4f1dbff6e5fc3a3b2fabaf61f85d7a856aceaa5985fe90ab09526e24ae5d41da51bd3759d5172a8e4386a05c853"

RPROVIDES:${PN} += "ghc-socks \
libHSsocks-0.6.1-5RVEIbYAf8qJqchdUVHVHw-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
