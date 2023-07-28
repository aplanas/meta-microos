SUMMARY = "Haskell base64-bytestring library development files"
DESCRIPTION = "This package provides the Haskell base64-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-devel-1.2.1.0-3.1.aarch64.rpm"
RPM_HASH = "67cc7f721835d2a47a18be0c0cf650ce1dcc59b7ce56c68a505102ef088947170020303e950d5fb78abf94fedad5745a1d1841161feb6d32340564c9714efe32"

RPROVIDES:${PN} += "ghc-base64-bytestring-devel \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base64-bytestring \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
