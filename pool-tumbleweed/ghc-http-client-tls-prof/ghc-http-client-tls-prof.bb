SUMMARY = "Haskell http-client-tls profiling library"
DESCRIPTION = "This package provides the Haskell http-client-tls profiling library."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-prof-0.3.6.1-2.8.aarch64.rpm"
RPM_HASH = "b0434f95125f5bb12f74cdc8274b808f6f399f6bc65882a964a9e56463318a8082650789bbedba82b38597ff369b67c046690f969cb6810e26b51dd0069e786a"

RPROVIDES:${PN} += "ghc-http-client-tls-prof \
ghc-prof-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1"

RDEPENDS:${PN} += "ghc-http-client-tls-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-connection-0.3.1-HritGhbYIMl4OD06E3KY8G \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-exceptions-0.10.5 \
ghc-prof-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-text-2.0.2 \
ghc-prof-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-prof-transformers-0.5.6.2"

inherit rpm
