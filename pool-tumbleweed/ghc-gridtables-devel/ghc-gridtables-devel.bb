SUMMARY = "Haskell gridtables library development files"
DESCRIPTION = "This package provides the Haskell gridtables library development files."
LICENSE = "MIT"

PV = "0.1.0.0"

RPM_NAME = "ghc-gridtables-devel-0.1.0.0-1.2.aarch64.rpm"
RPM_HASH = "b61b3836de838e107cbca32570b0104e486f9de1462f9321fe3b77db77876c6a97007fa7c0257dca5f48ee045f596804b32213b59a95e21e6f05ff3650fb4509"

RPROVIDES:${PN} += "ghc-devel(gridtables-0.1.0.0-I8M3kz7LaeTJ8iEjDWUjrS) \
ghc-gridtables-devel \
ghc-gridtables-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(text-2.0.2) \
ghc-gridtables"

inherit rpm
