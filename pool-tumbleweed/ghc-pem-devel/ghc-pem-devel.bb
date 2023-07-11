SUMMARY = "Haskell pem library development files"
DESCRIPTION = "This package provides the Haskell pem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-devel-0.2.4-8.6.aarch64.rpm"
RPM_HASH = "c357f289d37f3878948d8f4b2520fe883ad0db87649d2573fdb1dc3865d8e79f488e6d3873b955e58423abcdf3913a57fabdb64be5b36d1002a74c72553a86c4"

RPROVIDES:${PN} += "ghc-devel-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS \
ghc-pem-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-pem"

inherit rpm
