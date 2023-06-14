SUMMARY = "Haskell colour library development files"
DESCRIPTION = "This package provides the Haskell colour library development files."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-devel-2.3.6-2.3.aarch64.rpm"
RPM_HASH = "5be3388ff9b2ee7a258c7bda14b90e074f2bc09af1f6069c9164659cd5fb529a12af9818337519f3b9d4db07716787cfad53ac0adc23884975db8d693fb8067b"

RPROVIDES:${PN} += "ghc-colour-devel \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln"

RDEPENDS:${PN} += "/bin/sh \
ghc-colour \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
