SUMMARY = "Haskell wai library development files"
DESCRIPTION = "This package provides the Haskell wai library development files."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-devel-3.2.3-2.3.aarch64.rpm"
RPM_HASH = "4bc78ed7093c49c4890dc1d05b637c12580fc99b3b29a188da0ce68e92ea24ff2968ad8db658e394217d63e7235bd4e96106d6138659ea0b0f05e478a0a898fd"

RPROVIDES:${PN} += "ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-wai-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-text-2.0.2 \
ghc-devel-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-wai"

inherit rpm
