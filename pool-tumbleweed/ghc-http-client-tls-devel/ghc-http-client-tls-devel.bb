SUMMARY = "Haskell http-client-tls library development files"
DESCRIPTION = "This package provides the Haskell http-client-tls library development \
files."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-devel-0.3.6.1-2.8.aarch64.rpm"
RPM_HASH = "9ade6859d0d6e5fe177f903d84e1d86b4a4c98cfd650c5ce3984e90e01e46458e524d4aebc21bc951f0810510d44d727594a0f264632d3ccaf73e8950ed6e452"

RPROVIDES:${PN} += "ghc-devel-http-client-tls-0.3.6.1-AsHsMYKW0OIKZ6XVfzITj1 \
ghc-http-client-tls-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-connection-0.3.1-HritGhbYIMl4OD06E3KY8G \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-LSC76M64GQaFgLGwFfgIgW \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-exceptions-0.10.5 \
ghc-devel-http-client-0.7.14-ElkaPC2YNimBwgzZzglgPe \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-text-2.0.2 \
ghc-devel-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-devel-transformers-0.5.6.2 \
ghc-http-client-tls"

inherit rpm
