SUMMARY = "Haskell postgresql-libpq library development files"
DESCRIPTION = "This package provides the Haskell postgresql-libpq library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-devel-0.9.5.0-2.9.aarch64.rpm"
RPM_HASH = "24ec22ae9eaa1127e8fac803bee835dde4bea8500608164bbf5173def3daf4323c35a7b98c4e0279bfb63884a92e17c73ac79302fd4b863f013224752c79d1d7"

RPROVIDES:${PN} += "ghc-devel-postgresql-libpq-0.9.5.0-LAEYJt6pIENHmjvWelVvQG \
ghc-postgresql-libpq-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-unix-2.7.3 \
ghc-postgresql-libpq \
postgresql-server-devel"

inherit rpm
