SUMMARY = "Haskell base-compat library development files"
DESCRIPTION = "This package provides the Haskell base-compat library development files."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "ghc-base-compat-devel-0.12.2-2.3.aarch64.rpm"
RPM_HASH = "db5fe050232da72d9b3d0da87cda7cf836f76ce2047fea5ecaa60380bc12fbd4f9067c7fd9acab5436197a591917c814b2dd18fff261317bd0609fcb2a0189c4"

RPROVIDES:${PN} += "ghc-base-compat-devel \
ghc-devel-base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-compat \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-unix-2.7.3"

inherit rpm
