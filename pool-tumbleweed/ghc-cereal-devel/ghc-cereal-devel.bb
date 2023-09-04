SUMMARY = "Haskell cereal library development files"
DESCRIPTION = "This package provides the Haskell cereal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-devel-0.5.8.3-2.8.aarch64.rpm"
RPM_HASH = "d4299fdd799c66a30602719e280d35d9ee5f9c9ed8c3ecad809e4688799abdc14bd97252d90d9188891c6379bf3be64152de00f17114ec459a9dc260ac75d960"

RPROVIDES:${PN} += "ghc-cereal-devel \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cereal \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.1"

inherit rpm
