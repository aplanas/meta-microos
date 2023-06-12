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

RPM_NAME = "ghc-HTTP-4000.4.1-1.3.aarch64.rpm"
RPM_HASH = "172e7a75a62e06a7e4faea67eb7d8e2d005bfa47d83d7a6aa5001999dadbd37fad872ff298d589ef5d501e090968389df6aa582f8bb55167e764f542ef573781"

RPROVIDES:${PN} += "ghc-HTTP \
ghc-HTTP(aarch-64) \
libHSHTTP-4000.4.1-BsHtin5O4EoLpElKRODQk3-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
