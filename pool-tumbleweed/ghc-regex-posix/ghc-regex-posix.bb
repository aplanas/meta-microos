SUMMARY = "POSIX Backend for 'Text.Regex' (regex-base)"
DESCRIPTION = "The POSIX regex backend for <//hackage.haskell.org/package/regex-base \
regex-base>. \
 \
The main appeal of this backend is that it's very lightweight due to its \
reliance on the ubiquitous \
<https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/regex.h.html POSIX.2 \
regex> facility that is provided by the standard C library on most POSIX \
platforms. \
 \
See also <https://wiki.haskell.org/Regular_expressions> for more information."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-0.96.0.1-4.3.aarch64.rpm"
RPM_HASH = "6224d67db0a57a4aede4e7f54bb55e1b837c6acfc9419c24f949172c40407e8729f53b4599169e19fc5e8748a9a499a63be248d9640d43e07e9b24a8737e474d"

RPROVIDES:${PN} += "ghc-regex-posix \
libHSregex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSregex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
