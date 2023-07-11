SUMMARY = "Haskell typed-process library development files"
DESCRIPTION = "This package provides the Haskell typed-process library development files."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-devel-0.2.11.0-1.6.aarch64.rpm"
RPM_HASH = "9a975da491ddfcf8f67f1d0985b804d9fc79c8892f170c9b2b828e9cc460efec478e44e8fc707d414ac662083b42759a082b3949ebcd5fa2f9e458474a741932"

RPROVIDES:${PN} += "ghc-devel-typed-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO \
ghc-typed-process-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-process-1.6.16.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-typed-process"

inherit rpm
