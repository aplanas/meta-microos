SUMMARY = "Haskell commonmark-extensions library documentation"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.4"

RPM_NAME = "ghc-commonmark-extensions-doc-0.2.3.4-1.7.noarch.rpm"
RPM_HASH = "147c98aa8c9f6585a2f7fda8ae29bb96e5655dfe9f407cd6c06b0101324fca022cdf733b7b019f3ce420ffb24c808c7e28757ef930561906f39053270dfab9ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commonmark-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
