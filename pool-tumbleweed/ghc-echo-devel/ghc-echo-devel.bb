SUMMARY = "Haskell echo library development files"
DESCRIPTION = "This package provides the Haskell echo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-devel-0.1.4-2.3.aarch64.rpm"
RPM_HASH = "8b78ca9e494dccb25ae08f8bc54d09f7ad89b62f1bb1200ae132fa079c08466e6e2b0b2ad03d77365122370c973e475e1618acd92864d1f898edb1eb3fc66283"

RPROVIDES:${PN} += "ghc-devel-echo-0.1.4-E70uPOVrrAEEin21p1eUkX \
ghc-echo-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-process-1.6.17.0 \
ghc-echo"

inherit rpm
