SUMMARY = "Haskell hjsmin library development files"
DESCRIPTION = "This package provides the Haskell hjsmin library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-devel-0.2.1-1.8.aarch64.rpm"
RPM_HASH = "aa3a0a1106e1fca7657a236479687d2438e2b06222162aff9fc8460331e98d75dd61bd78bd31e20078816159494f1b605f9ff248bf309fd00ada7e0ba46ef023"

RPROVIDES:${PN} += "ghc-devel-hjsmin-0.2.1-5GDclcDeF3LDFr0332m90w \
ghc-hjsmin-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-language-javascript-0.7.1.0-5tkeoDchqnObRztPRYxz4 \
ghc-devel-text-2.0.2 \
ghc-hjsmin"

inherit rpm
