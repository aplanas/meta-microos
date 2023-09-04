SUMMARY = "A library for client-side HTTP"
DESCRIPTION = "The HTTP package supports client-side web programming in Haskell. It lets you \
set up HTTP connections, transmitting requests and processing the responses \
coming back, all from within the comforts of Haskell. It's dependent on the \
network package to operate, but other than that, the implementation is all \
written in Haskell. \
 \
A basic API for issuing single HTTP requests + receiving responses is provided. \
On top of that, a session-level abstraction is also on offer (the \
'BrowserAction' monad); it taking care of handling the management of persistent \
connections, proxies, state (cookies) and authentication credentials required \
to handle multi-step interactions with a web server. \
 \
The representation of the bytes flowing across is extensible via the use of a \
type class, letting you pick the representation of requests and responses that \
best fits your use. Some pre-packaged, common instances are provided for you \
('ByteString', 'String'). \
 \
Here's an example use: \
 \
> > do > rsp <- Network.HTTP.simpleHTTP (getRequest 'http://www.haskell.org/') \
> -- fetch document and return it (as a 'String'.) > fmap (take 100) \
(getResponseBody rsp) > > do > (_, rsp) > <- Network.Browser.browse $ do > \
setAllowRedirects True -- handle HTTP redirects > request $ getRequest \
'http://www.haskell.org/' > return (take 100 (rspBody rsp)) \
 \
__Note:__ This package does not support HTTPS connections. If you need HTTPS, \
take a look at the following packages: \
 \
* <http://hackage.haskell.org/package/http-streams http-streams> \
 \
* <http://hackage.haskell.org/package/http-client http-client> (in combination \
with <http://hackage.haskell.org/package/http-client-tls http-client-tls>) \
 \
* <http://hackage.haskell.org/package/req req> \
 \
* <http://hackage.haskell.org/package/wreq wreq>."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-4000.4.1-1.9.aarch64.rpm"
RPM_HASH = "0e933f405923d8e2345f22ecac9784a6b29d542b952f8832ef5761106f0790c065f0a70665639edd4bf944484965d0ff0aaf949adc909db9ef78577f4a519ee7"

RPROVIDES:${PN} += "ghc-HTTP \
libHSHTTP-4000.4.1-3WMT280F7oaHvlFLV6WG4L-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSnetwork-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
