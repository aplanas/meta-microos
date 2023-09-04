SUMMARY = "Haskell tls library development files"
DESCRIPTION = "This package provides the Haskell tls library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-devel-1.6.0-2.9.aarch64.rpm"
RPM_HASH = "f3d0ef387315b590bb7e185d69671c7bc59d7bab16761b9cadc734e4b8fa8e7d640d3d970bee678a8449c9f287cee3b39f7b0d45cd7844be2529567a69cf8023"

RPROVIDES:${PN} += "ghc-devel-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-devel-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-devel-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-devel-x509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4 \
ghc-tls"

inherit rpm
