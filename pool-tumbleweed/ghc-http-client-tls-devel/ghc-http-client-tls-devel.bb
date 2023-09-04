SUMMARY = "Haskell http-client-tls library development files"
DESCRIPTION = "This package provides the Haskell http-client-tls library development \
files."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-devel-0.3.6.1-2.7.aarch64.rpm"
RPM_HASH = "dc0b7ca99ca1b3434b4fd1c4374cef5844c290c8a0a9967129b9909023893231ba84a20cfcf658b3f120697ab1faf919dc5542f0c07c04081eb388a6903d2a39"

RPROVIDES:${PN} += "ghc-devel-http-client-tls-0.3.6.1-FlsMdDWaVoFLIhxPfXPqPa \
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
ghc-devel-http-client-0.7.14-DEHi4b5z3Pa56fFNKIs9J1 \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-text-2.0.2 \
ghc-devel-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-devel-transformers-0.5.6.2 \
ghc-http-client-tls"

inherit rpm
