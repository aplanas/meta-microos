SUMMARY = "Haskell control-monad-free library development files"
DESCRIPTION = "This package provides the Haskell control-monad-free library development \
files."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-devel-0.6.2-4.6.aarch64.rpm"
RPM_HASH = "0162e2fc35bfc63299586bed9b75ac27df5b7b5b52da87fa372cb7589060222e080e8145c9d061a98b0fb17e51212ec2e76248c26bc5c3ed73c47812a67523a2"

RPROVIDES:${PN} += "ghc-control-monad-free-devel \
ghc-devel-control-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-control-monad-free \
ghc-devel-base-4.17.1.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
