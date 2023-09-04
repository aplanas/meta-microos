SUMMARY = "Processing HTTP Content-Type and Accept headers"
DESCRIPTION = "This library is intended to be a comprehensive solution to parsing and \
selecting quality-indexed values in HTTP headers. It is capable of parsing both \
media types and language parameters from the Accept and Content header \
families, and can be extended to match against other accept headers as well. \
Selecting the appropriate header value is achieved by comparing a list of \
server options against the quality-indexed values supplied by the client. \
 \
In the following example, the Accept header is parsed and then matched against \
a list of server options to serve the appropriate media using 'mapAcceptMedia': \
 \
> getHeader >>= maybe send406Error sendResourceWith . mapAcceptMedia > [ \
('text/html', asHtml) > , ('application/json', asJson) > ] \
 \
Similarly, the Content-Type header can be used to produce a parser for request \
bodies based on the given content type with 'mapContentMedia': \
 \
> getContentType >>= maybe send415Error readRequestBodyWith . \
mapContentMedia > [ ('application/json', parseJson) > , ('text/plain', \
parseText) > ] \
 \
The API is agnostic to your choice of server."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-0.8.0.0-6.9.aarch64.rpm"
RPM_HASH = "528c011724af3b9d7c3bb6db7c8c199c16fff16a3e8b6d4fb8a0243078692cc02a2727fee1c3b5010a9db35eb284909acfe3b128127caecfe4aaf60ac194d304"

RPROVIDES:${PN} += "ghc-http-media \
libHShttp-media-0.8.0.0-5rJoZcqaWn0K15WzbWDvFb-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
