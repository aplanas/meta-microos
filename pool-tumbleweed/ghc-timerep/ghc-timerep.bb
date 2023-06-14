SUMMARY = "Parse and display time according to some RFCs (RFC3339, RFC2822, RFC822)"
DESCRIPTION = "Parse and display time according to some RFC's. \
 \
Supported: \
 \
* RFC822 <http://www.ietf.org/rfc/rfc0822.txt> \
 \
* RFC2822 <http://www.ietf.org/rfc/rfc2822.txt> \
 \
* RFC3339 <http://www.ietf.org/rfc/rfc3339.txt> \
 \
Special thanks to Koral for all the suggestions and help in solving some bugs."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-2.1.0.0-1.5.aarch64.rpm"
RPM_HASH = "49d9b2084563707854dea68091b05f8375dcd43ed22971256daa09331c9d8d8c87b45abe9696a4e904f63737ea520d7ad8e40746509516cdf5f285a90174f904"

RPROVIDES:${PN} += "ghc-timerep \
libHStimerep-2.1.0.0-I3sgV342xF22sEKbdw3Ltk-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScommutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so \
libHSmonoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimes-0.2.1.0-EDehUtw1pOPPL7EktYCRg-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
