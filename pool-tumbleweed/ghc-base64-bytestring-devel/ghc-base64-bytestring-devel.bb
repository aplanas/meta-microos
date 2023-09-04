SUMMARY = "Haskell base64-bytestring library development files"
DESCRIPTION = "This package provides the Haskell base64-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-devel-1.2.1.0-3.3.aarch64.rpm"
RPM_HASH = "e6298c222ca45ad0d834c10bc9e31adcabe5d07275ddbf32120604cbeb0d980db116bdab087126ac10ddb022f68e52a753a2ccec4f2a96af38009364d6d10f3c"

RPROVIDES:${PN} += "ghc-base64-bytestring-devel \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base64-bytestring \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
