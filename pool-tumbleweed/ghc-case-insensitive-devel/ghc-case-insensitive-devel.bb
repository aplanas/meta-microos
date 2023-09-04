SUMMARY = "Haskell case-insensitive library development files"
DESCRIPTION = "This package provides the Haskell case-insensitive library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-devel-1.2.1.0-6.4.aarch64.rpm"
RPM_HASH = "966e4cefa1a52bd8c9b7ef605bc91348ab1fa725a9a3cfd8016b9c69bd830fb034649bbd1b560328db334162524aa73d8149bc2679a659c24c79dea82f417ddd"

RPROVIDES:${PN} += "ghc-case-insensitive-devel \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-case-insensitive \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-text-2.0.2"

inherit rpm
