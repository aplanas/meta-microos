SUMMARY = "Haskell base64-bytestring library development files"
DESCRIPTION = "This package provides the Haskell base64-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-devel-1.2.1.0-2.6.aarch64.rpm"
RPM_HASH = "7afdb1f1292e8c24c44947c731895612ca5b96d0074b52b9975250e9b355d8cf99eb6a1d4a32599ce0fa38f8d886eeb461df8ec718df565bdc58a82c2c15b2e7"

RPROVIDES:${PN} += "ghc-base64-bytestring-devel \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base64-bytestring \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
