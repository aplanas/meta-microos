SUMMARY = "Haskell filepattern library development files"
DESCRIPTION = "This package provides the Haskell filepattern library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-devel-0.1.3-2.7.aarch64.rpm"
RPM_HASH = "f49f4cd0eae2bf425be41da20d81fabc7056ec4fcedca8038eee633bc30edbf57b31937b9c8eaf65f1a045e768a948bd53d0f3a7db06548e1db2e8e8be7ceb3b"

RPROVIDES:${PN} += "ghc-devel-filepattern-0.1.3-CFBsL0RN2YG3tR2tZTKdgo \
ghc-filepattern-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4 \
ghc-devel-filepath-1.4.2.2 \
ghc-filepattern"

inherit rpm
