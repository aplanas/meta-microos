SUMMARY = "Haskell html profiling library"
DESCRIPTION = "This package provides the Haskell html profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-prof-1.0.1.2-4.3.aarch64.rpm"
RPM_HASH = "bc039745ea1eeacc9cdcf7dd82e23f76c5b92c6af4a232edef7d66de8e5493b12c3fcadc0ff7502735d8950b8239408b354a07432ecf51d2d911356d155ab687"

RPROVIDES:${PN} += "ghc-html-prof \
ghc-prof-html-1.0.1.2-Ei0LKBl3CyAHMF3GZI2hqu"

RDEPENDS:${PN} += "ghc-html-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
