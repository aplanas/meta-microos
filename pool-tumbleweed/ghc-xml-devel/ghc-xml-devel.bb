SUMMARY = "Haskell xml library development files"
DESCRIPTION = "This package provides the Haskell xml library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-devel-1.3.14-13.8.aarch64.rpm"
RPM_HASH = "5995ca82601fc12b74a8347ecc9411478b872493921f6cf29a7fa55986da98928e21acdfd88988e84e23305e91f5b2bf9c236a55af965117713f6a0927c2c9cf"

RPROVIDES:${PN} += "ghc-devel-xml-1.3.14-JgZFWdUND2BGObIBmJlnFJ \
ghc-xml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2 \
ghc-xml"

inherit rpm
