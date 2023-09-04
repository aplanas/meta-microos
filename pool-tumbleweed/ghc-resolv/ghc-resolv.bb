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

RPM_NAME = "ghc-resolv-0.1.2.0-10.8.aarch64.rpm"
RPM_HASH = "f57165a9d1024b1c42bca19c69aec190fc11dc976d80db0d9376c50179fe0be933901c91f43b6233dcd6204815ea8e9b289dd50584d364e57fda619fd9699edf"

RPROVIDES:${PN} += "ghc-resolv \
libHSresolv-0.1.2.0-LPfwrdmMO1tC4Sn0ebxMDl-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
