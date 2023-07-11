SUMMARY = "Haskell gitrev library development files"
DESCRIPTION = "This package provides the Haskell gitrev library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-devel-1.3.1-9.3.aarch64.rpm"
RPM_HASH = "d59eeebf3332c633507ef95be12e7f937982dc61d761cce309bc7cc92da7d766161165a8eca169ebe9ac7aa189cb43a66e6f9fc94b6dfbc7787db838f60f6d2c"

RPROVIDES:${PN} += "ghc-devel-gitrev-1.3.1-CQYGfdCfGPeA3DF217wQTZ \
ghc-gitrev-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-gitrev"

inherit rpm
