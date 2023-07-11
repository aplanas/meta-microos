SUMMARY = "Haskell vault library development files"
DESCRIPTION = "This package provides the Haskell vault library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-devel-0.3.1.5-4.6.aarch64.rpm"
RPM_HASH = "504856659075b573dacaed51579209312df86c22d215e4a18b30cce0c92339c9c40310e125f77cd530c325b4ab188c90faf2b12a8681a58dde8298458cd418e3"

RPROVIDES:${PN} += "ghc-devel-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-vault-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-vault"

inherit rpm
