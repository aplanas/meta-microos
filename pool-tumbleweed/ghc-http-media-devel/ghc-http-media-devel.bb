SUMMARY = "Haskell http-media library development files"
DESCRIPTION = "This package provides the Haskell http-media library development files."
LICENSE = "MIT"

PV = "0.8.1.0"

RPM_NAME = "ghc-http-media-devel-0.8.1.0-1.1.aarch64.rpm"
RPM_HASH = "b186f33445583c692907de9ec13b63dedf815ce5078da09f45c428f02ed125a48ff0922bf75aa43c499dc990d881d61d12e27450a063ab17d72e1e299d8d1dce"

RPROVIDES:${PN} += "ghc-devel-http-media-0.8.1.0-COFozQnKf3L2ra0cnOflYd \
ghc-http-media-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-http-media"

inherit rpm
