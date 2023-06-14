SUMMARY = "Haskell base16-bytestring library development files"
DESCRIPTION = "This package provides the Haskell base16-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-devel-1.0.2.0-2.2.aarch64.rpm"
RPM_HASH = "8cdf336d646b90e1bcafe2e1ea3baaec4432e2e19a19ca95ab9759b7ad8e81560f2b5da8f91f965995162c8516a065f59ffcabd27bf2a8cd1753b81a1ad3905f"

RPROVIDES:${PN} += "ghc-base16-bytestring-devel \
ghc-devel-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU"

RDEPENDS:${PN} += "/bin/sh \
ghc-base16-bytestring \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
