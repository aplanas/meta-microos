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

RPM_NAME = "ghc-http-media-0.8.0.0-6.3.aarch64.rpm"
RPM_HASH = "bd784fb378f9d89421be734e5608747baf34719db86df711fd26e606a437397133eac807126df19e04211197eeed7eeab0f37eef426dddb3f30c4ace6dccd923"

RPROVIDES:${PN} += "ghc-http-media \
ghc-http-media(aarch-64) \
libHShttp-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
