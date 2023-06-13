SUMMARY = "Haskell ed25519 library development files"
DESCRIPTION = "This package provides the Haskell ed25519 library development files."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-devel-0.0.5.0-16.2.aarch64.rpm"
RPM_HASH = "c1dd5dca6f0e98b3ca223ee6c1701b4443827b73af43a1b5a11e12344f2d46967831119558170b97511871abb388fae1a5cc5837ecc3642a197a1464eebd68ba"

RPROVIDES:${PN} += "ghc-devel(ed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8) \
ghc-ed25519-devel \
ghc-ed25519-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-ed25519"

inherit rpm
