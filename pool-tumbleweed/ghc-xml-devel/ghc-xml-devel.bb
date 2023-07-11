SUMMARY = "Haskell xml library development files"
DESCRIPTION = "This package provides the Haskell xml library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-devel-1.3.14-13.6.aarch64.rpm"
RPM_HASH = "894ed0622aeb1aa3c4ef8793a53ce70834bf233feda9578b11aa4f7a1966a1cf9432827d7f260c3f8c86af13a5de35bed7c0a8417aa0e71ae4611b7c8856d1a1"

RPROVIDES:${PN} += "ghc-devel-xml-1.3.14-BBPDUWQuUpt3QYOr4h6J5g \
ghc-xml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2 \
ghc-xml"

inherit rpm
