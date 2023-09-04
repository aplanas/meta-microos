SUMMARY = "Haskell x509 profiling library"
DESCRIPTION = "This package provides the Haskell x509 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-prof-1.7.7-2.8.aarch64.rpm"
RPM_HASH = "121756c73dabbf8af7d0cc2b11f4c4f25ea2401d55b03a181d2c7627edc602f6bbe35a5bee1e312b877fe0160b09ac98e0b90a02897f3532e2e664fb1b7062fc"

RPROVIDES:${PN} += "ghc-prof-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-x509-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-prof-asn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG \
ghc-prof-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2 \
ghc-prof-transformers-0.5.6.2 \
ghc-x509-devel"

inherit rpm
