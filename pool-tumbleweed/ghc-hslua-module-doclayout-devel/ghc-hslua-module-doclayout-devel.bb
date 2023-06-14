SUMMARY = "Haskell hslua-module-doclayout library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout library \
development files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-devel-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "b60b9c05af138352235bb9703aadbc9b5f67ece3f9e84ca3fb06de34741558bf1950979103becb0bf184cf6c1a160efd770555afb774d6a1b0b503550e664d0c"

RPROVIDES:${PN} += "ghc-devel-hslua-module-doclayout-1.1.0-H1N0AwnXIkUJX0H1lSxUWS \
ghc-hslua-module-doclayout-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-devel-hslua-2.3.0-1soYqkTydt2HAPmAXqHREY \
ghc-devel-text-2.0.2 \
ghc-hslua-module-doclayout"

inherit rpm
