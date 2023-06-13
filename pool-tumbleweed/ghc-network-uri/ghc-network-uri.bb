SUMMARY = "URI manipulation"
DESCRIPTION = "This package provides facilities for parsing and unparsing URIs, and creating \
and resolving relative URI references, closely following the URI spec, \
<http://www.ietf.org/rfc/rfc3986.txt IETF RFC 3986>. \
 \
== Backward-compatibility \
 \
In 'network-2.6' the 'Network.URI' module was split off from the 'network' \
package into this package. If you're using the 'Network.URI' module you can be \
backward compatible and automatically get it from the right package by using \
the </package/network-uri-flag network-uri-flag pseudo-package> in your \
'.cabal' file's build-depends (along with dependencies for both 'network-uri' \
and 'network'): \
 \
> build-depends: > network-uri-flag == 0.1.* \
 \
Or you can do the same manually by adding this boilerplate to your '.cabal' \
file: \
 \
> flag network-uri > description: Get Network.URI from the network-uri package \
> default: True > > library > -- ... > if flag(network-uri) > build-depends: \
network-uri >= 2.6, network >= 2.6 > else > build-depends: network-uri < 2.6, \
network < 2.6 \
 \
That is, get the module from either 'network < 2.6' or from 'network-uri >= \
2.6'."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-2.6.4.2-2.3.aarch64.rpm"
RPM_HASH = "fd0387a98de566f38ac266f00be845513e82509f3476da5a01714cb3e52d820fa05b6ba796514590fcc0ff0e3387e54afed70e070241c6570391687fca0cd186"

RPROVIDES:${PN} += "ghc-network-uri \
ghc-network-uri(aarch-64) \
libHSnetwork-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSth-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
