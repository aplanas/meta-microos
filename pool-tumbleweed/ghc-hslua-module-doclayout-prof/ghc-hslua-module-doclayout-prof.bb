SUMMARY = "Haskell hslua-module-doclayout profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-prof-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "eeaf536c647e0bf352ed060c630249a831791c9cf9f801a087e7ab1bf9eb755e39adb0136b415ed9ec7f7428f51f5e47b68a651d6f70c308a857cdc908c7a79b"

RPROVIDES:${PN} += "ghc-hslua-module-doclayout-prof \
ghc-prof-hslua-module-doclayout-1.1.0-H1N0AwnXIkUJX0H1lSxUWS"

RDEPENDS:${PN} += "ghc-hslua-module-doclayout-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-prof-hslua-2.3.0-1soYqkTydt2HAPmAXqHREY \
ghc-prof-text-2.0.2"

inherit rpm
