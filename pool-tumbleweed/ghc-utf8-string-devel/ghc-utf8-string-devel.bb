SUMMARY = "Haskell utf8-string library development files"
DESCRIPTION = "This package provides the Haskell utf8-string library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-devel-1.0.2-2.3.aarch64.rpm"
RPM_HASH = "47b63ffb2685552535e949be733274359e45265aa911271e2128cd5574080ba14b7930f5ec107ec9d9cae63440befb9a7cb9f2216f1a8344c07646a414934f0b"

RPROVIDES:${PN} += "ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-utf8-string-devel \
ghc-utf8-string-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-utf8-string"

inherit rpm
