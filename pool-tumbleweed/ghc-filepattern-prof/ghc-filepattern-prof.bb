SUMMARY = "Haskell filepattern profiling library"
DESCRIPTION = "This package provides the Haskell filepattern profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-prof-0.1.3-2.4.aarch64.rpm"
RPM_HASH = "0e937a75230e89e0ebb7e2d179e06454cab4bf3ba8b54f3be6facfbfe244bb6b0bb37748f66dee7de904fdf3ab18cea46d3c4dd5da34b3a27ab34b5bd514c50f"

RPROVIDES:${PN} += "ghc-filepattern-prof \
ghc-filepattern-prof(aarch-64) \
ghc-prof(filepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo)"

RDEPENDS:${PN} += "ghc-filepattern-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4) \
ghc-prof(filepath-1.4.2.2)"

inherit rpm
