SUMMARY = "Haskell text-conversions profiling library"
DESCRIPTION = "This package provides the Haskell text-conversions profiling library."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-prof-0.3.1.1-2.3.aarch64.rpm"
RPM_HASH = "c99b5aa7f2b4f8e25cc18162165bac7eb4698c54a0148fd1c471f4717d50047c60faafb530b151ff7e9cdfadbdd7353050fe26521be5b419071af040b5304312"

RPROVIDES:${PN} += "ghc-prof-text-conversions-0.3.1.1-HJG9QLMf9pVESk7Lf3iSH7 \
ghc-text-conversions-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2 \
ghc-text-conversions-devel"

inherit rpm
