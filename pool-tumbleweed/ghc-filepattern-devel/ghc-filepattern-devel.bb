SUMMARY = "Haskell filepattern library development files"
DESCRIPTION = "This package provides the Haskell filepattern library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-devel-0.1.3-2.4.aarch64.rpm"
RPM_HASH = "05f7377d7887bc1bb8a41d696d6a946e9670506df748c84e357efdfdac8f426b6506b36833403450948fbb0f0041ff09a52430473576b0015685655ad0c5da9d"

RPROVIDES:${PN} += "ghc-devel-filepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo \
ghc-filepattern-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4 \
ghc-devel-filepath-1.4.2.2 \
ghc-filepattern"

inherit rpm
