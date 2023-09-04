SUMMARY = "Haskell text-conversions library development files"
DESCRIPTION = "This package provides the Haskell text-conversions library development \
files."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-devel-0.3.1.1-2.3.aarch64.rpm"
RPM_HASH = "271ce815407fb13488e22c6e5374d6bd68c4a515c671c6bebb6d9b210e1d4e301ab796b4059c5ad9d6b550e54973657eda5a02c657994d76ca07902622a09544"

RPROVIDES:${PN} += "ghc-devel-text-conversions-0.3.1.1-HJG9QLMf9pVESk7Lf3iSH7 \
ghc-text-conversions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2 \
ghc-text-conversions"

inherit rpm
