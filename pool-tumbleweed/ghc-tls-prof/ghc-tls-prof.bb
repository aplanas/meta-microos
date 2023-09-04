SUMMARY = "Haskell tls profiling library"
DESCRIPTION = "This package provides the Haskell tls profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-prof-1.6.0-2.9.aarch64.rpm"
RPM_HASH = "4a5aa73d707f7b9f9833a589d49c82c8bf033b6472960bd5ac76653ecbb62de86770fe0981ec0ecfbb8fb4c612b6e17836a59919a7ee6f97a17c799f76443953"

RPROVIDES:${PN} += "ghc-prof-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-tls-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-prof-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-prof-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-prof-x509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4 \
ghc-tls-devel"

inherit rpm
