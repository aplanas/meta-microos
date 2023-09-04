SUMMARY = "Haskell css-text library development files"
DESCRIPTION = "This package provides the Haskell css-text library development files."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-devel-0.1.3.0-4.9.aarch64.rpm"
RPM_HASH = "b26ba85c68abba0f2c9e41f4e32e333e4c8d57a64068ffc6bb9d8f4fba8faa6c386e964c8793563fef31442b227935860bea824609b306530d59cef11ef0cb8f"

RPROVIDES:${PN} += "ghc-css-text-devel \
ghc-devel-css-text-0.1.3.0-8klVmv0TGJS6WEADR2StQO"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-css-text \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-text-2.0.2"

inherit rpm
