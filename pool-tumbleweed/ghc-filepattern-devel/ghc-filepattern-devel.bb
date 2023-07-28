SUMMARY = "Haskell filepattern library development files"
DESCRIPTION = "This package provides the Haskell filepattern library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-devel-0.1.3-2.9.aarch64.rpm"
RPM_HASH = "df8f9788293033f249f537597d870f90361c8d7be61c7ebfb0f0e8bf61ee0e6ae5c5c0b54d243d0152e654bdd520063a56189cd3523bfb760dac069904439a8e"

RPROVIDES:${PN} += "ghc-devel-filepattern-0.1.3-3YAZmlhLkyq9JKYM4OPVoZ \
ghc-filepattern-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.14-9MsHIUa0FAo4DKg07m0mTc \
ghc-devel-filepath-1.4.2.2 \
ghc-filepattern"

inherit rpm
