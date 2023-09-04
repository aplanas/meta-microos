SUMMARY = "Replaces/enhances 'Text.Regex'"
DESCRIPTION = "One module compat layer over <//hackage.haskell.org/package/regex-posix \
regex-posix> to replace 'Text.Regex'. \
 \
See also <https://wiki.haskell.org/Regular_expressions> for more information."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.1"

RPM_NAME = "ghc-regex-compat-0.95.2.1-4.3.aarch64.rpm"
RPM_HASH = "2aff1c7dd0289a5ed5918f71ebf9f9c084f7bd8415b167fa9ea4042f131756d284ede42483c3c55cd65fe0018ccd68047632b7871b00ecc7791332a4a2b3086a"

RPROVIDES:${PN} += "ghc-regex-compat \
libHSregex-compat-0.95.2.1-L593ugdrX2dLr3iiylKH00-ghc9.4.6.so"

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
libHSregex-posix-0.96.0.1-HPjTUAiEjSWDym26QwChO7-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
