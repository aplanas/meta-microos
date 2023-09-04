SUMMARY = "Haskell skein library development files"
DESCRIPTION = "This package provides the Haskell skein library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-devel-1.0.9.4-4.5.aarch64.rpm"
RPM_HASH = "f02d9ba4dc48998582c9626d48dc87b87833d2b625491b9850ae3280191ff2468312dbaea2ad38b598ba758aaea15e42b83d8a93ff8a378faa5a5e944d6dba91"

RPROVIDES:${PN} += "ghc-devel-skein-1.0.9.4-HfR9tmKKFFp5G94XUHSnaw \
ghc-skein-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-crypto-api-0.13.3-2rX3thRbGDW3ZR7H62fg4Z \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-skein"

inherit rpm
