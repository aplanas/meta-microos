SUMMARY = "Domain Name Service (DNS) lookup via the libresolv standard library routines"
DESCRIPTION = "This package implements an API for accessing the [Domain Name Service \
(DNS)](https://tools.ietf.org/html/rfc1035) resolver service via the standard \
'libresolv' system library (whose API is often available directly via the \
standard 'libc' C library) on Unix systems. \
 \
This package also includes support for decoding message record types as defined \
in the following RFCs: \
 \
- [RFC 1035](https://tools.ietf.org/html/rfc1035): Domain Names - \
Implementation And Specification - [RFC \
1183](https://tools.ietf.org/html/rfc1183): New DNS RR Definitions - [RFC \
2782](https://tools.ietf.org/html/rfc2782): A DNS RR for specifying the \
location of services (DNS SRV) - [RFC \
2915](https://tools.ietf.org/html/rfc2915): The Naming Authority Pointer \
(NAPTR) DNS Resource Record - [RFC 3596](https://tools.ietf.org/html/rfc3596): \
DNS Extensions to Support IP Version 6 - [RFC \
4034](https://tools.ietf.org/html/rfc4034): Resource Records for the DNS \
Security Extensions - [RFC 4255](https://tools.ietf.org/html/rfc4255): Using \
DNS to Securely Publish Secure Shell (SSH) Key Fingerprints - [RFC \
4408](https://tools.ietf.org/html/rfc4408): Sender Policy Framework (SPF) for \
Authorizing Use of Domains in E-Mail, Version 1 - [RFC \
5155](https://tools.ietf.org/html/rfc5155): DNS Security (DNSSEC) Hashed \
Authenticated Denial of Existence - [RFC \
6844](https://tools.ietf.org/html/rfc6844): DNS Certification Authority \
Authorization (CAA) Resource Record - [RFC \
6891](https://tools.ietf.org/html/rfc6891): Extension Mechanisms for DNS \
(EDNS(0)) - [RFC 7553](https://tools.ietf.org/html/rfc7553): The Uniform \
Resource Identifier (URI) DNS Resource Record \
 \
For Windows, the package [windns](https://hackage.haskell.org/package/windns) \
provides a compatible subset of this package's API."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-0.1.2.0-10.3.aarch64.rpm"
RPM_HASH = "df9fb3b00873cf8c9b3ec30081932b7d573109662e2a489231ddc022ed83b7820aee8c0180a7ae8da0d780f1dd5b4e1baa256020ada9e165a0ef5e3a40487243"

RPROVIDES:${PN} += "ghc-resolv \
ghc-resolv(aarch-64) \
libHSresolv-0.1.2.0-AYruoqdjlgt9u8SdYnpGUr-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
