SUMMARY = "Haskell hslua library documentation"
DESCRIPTION = "This package provides the Haskell hslua library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-doc-2.3.0-1.6.noarch.rpm"
RPM_HASH = "6162d29e6f79f3c0a254ccf04dee8026902f8eefb00e7bd24eace4ee644d110d7a1b42ea08b8e5e92f92f6b1e7de9b5cddd5052ce08af21cc5923f2341f8cc01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
