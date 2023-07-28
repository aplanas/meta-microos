SUMMARY = "Haskell zlib library documentation"
DESCRIPTION = "This package provides the Haskell zlib library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-zlib-doc-0.6.3.0-3.1.noarch.rpm"
RPM_HASH = "364244c8f99f287599cb5cd4fbbc0f554b1af1f18ae803b5bf269b4646646b726b7fae572dac9440296ac8bc290b0b7d1fee7cd5b4f75fc86172736f441c46e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-zlib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
