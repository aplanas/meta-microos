SUMMARY = "Haskell safe-exceptions library development files"
DESCRIPTION = "This package provides the Haskell safe-exceptions library development \
files."
LICENSE = "MIT"

PV = "0.1.7.3"

RPM_NAME = "ghc-safe-exceptions-devel-0.1.7.3-2.2.aarch64.rpm"
RPM_HASH = "32b6c37f7d6154dd554c5e3e0f9c5664e7ec99405114718f44179bef5ff0e7ff9b116213e74878a8d9d1ea392a7b397e348b351002b861c5514074255fda4cbc"

RPROVIDES:${PN} += "ghc-devel(safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD) \
ghc-safe-exceptions-devel \
ghc-safe-exceptions-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(transformers-0.5.6.2) \
ghc-safe-exceptions"

inherit rpm
