SUMMARY = "Haskell x509 library development files"
DESCRIPTION = "This package provides the Haskell x509 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-devel-1.7.7-2.8.aarch64.rpm"
RPM_HASH = "3b0d46f27411c3c424c78a5e2e4a94d34f2126c1e8bd7cda31196eb2a66df20e2f2c46f84e94e363a6fc0fa63693b40e0ac70f1d698179dda62902e2df9e9490"

RPROVIDES:${PN} += "ghc-devel-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-x509-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-devel-asn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG \
ghc-devel-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-devel-transformers-0.5.6.2 \
ghc-x509"

inherit rpm
