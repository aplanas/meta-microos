SUMMARY = "Haskell filepattern profiling library"
DESCRIPTION = "This package provides the Haskell filepattern profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-prof-0.1.3-2.7.aarch64.rpm"
RPM_HASH = "94497aade5fc7341464bbe9f8e89dbe6f1bdc108ce3ac9db14fc3a5bb6ab74580c6afeaea8169e48b83f57379b598c9beb89fccf5701b8ba7aedde4aa9c5b650"

RPROVIDES:${PN} += "ghc-filepattern-prof \
ghc-prof-filepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo"

RDEPENDS:${PN} += "ghc-filepattern-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4 \
ghc-prof-filepath-1.4.2.2"

inherit rpm
