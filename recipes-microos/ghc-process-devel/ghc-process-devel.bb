SUMMARY = "Haskell process library development files"
DESCRIPTION = "This package provides the Haskell process library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-devel-1.6.16.0-1.1.aarch64.rpm"
RPM_HASH = "572ff7b1a2e6959fe40848abf9172f848a23f74f7b3a8f3f5deb8fe40a16d3150c67ff8b8c94eee181dc531ecd6db80d0d32319fa3807e9a721ee7d1dfcd87fb"

RPROVIDES:${PN} += "ghc-devel(process-1.6.16.0) ghc-process-devel ghc-process-devel(aarch-64) ghc-process-static ghc-process-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(filepath-1.4.2.2) ghc-devel(unix-2.7.3) ghc-process(aarch-64)"

inherit rpm
