SUMMARY = "Haskell entropy library development files"
DESCRIPTION = "This package provides the Haskell entropy library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-devel-0.4.1.10-3.3.aarch64.rpm"
RPM_HASH = "e97c9ab64378ca8faf70f0677e8c931a828d3b23cf4b582843cb98ea3ac780fcd19438973a31de4912ed1b243a09082444530c001e5bc14289a88f5b67add674"

RPROVIDES:${PN} += "ghc-devel-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-entropy-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-unix-2.7.3 \
ghc-entropy"

inherit rpm
