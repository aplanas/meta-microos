SUMMARY = "Safe conversions between textual types"
DESCRIPTION = "Safe conversions between textual types."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-0.3.1.1-2.2.aarch64.rpm"
RPM_HASH = "a96cf228923d418fb1bd86c23767de4af1a0c81578d75dcf4b121825b28ae54e546a8e74810d2937263c8a155fc8e25cf61ead9196ec69804ec2e34eacd4d498"

RPROVIDES:${PN} += "ghc-text-conversions \
libHStext-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU-ghc9.4.5.so \
libHSbase64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
