SUMMARY = "Haskell monad-loops library development files"
DESCRIPTION = "This package provides the Haskell monad-loops library development files."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-devel-0.4.3-11.2.aarch64.rpm"
RPM_HASH = "8a57c8f0d62e8bf5572d162c88cfc1fcb3f4da302df1ea67b8670b098a738dfb62ee4bb93b3de85df1d1a9cf7d8e21054514bd48b0997278ebde858be716801a"

RPROVIDES:${PN} += "ghc-devel-monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9 \
ghc-monad-loops-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-monad-loops"

inherit rpm
