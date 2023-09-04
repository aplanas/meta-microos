SUMMARY = "Haskell http-media library development files"
DESCRIPTION = "This package provides the Haskell http-media library development files."
LICENSE = "MIT"

PV = "0.8.0.0"

RPM_NAME = "ghc-http-media-devel-0.8.0.0-6.9.aarch64.rpm"
RPM_HASH = "11da7d84dc66aad4fad2553d13cb0213e2cb401b9c38f21d061d7556e972a68e1cec4cd25b35e2c095188ed587e76f9d0bd32b26f1ea4fa494d7aa1dc344b737"

RPROVIDES:${PN} += "ghc-devel-http-media-0.8.0.0-5rJoZcqaWn0K15WzbWDvFb \
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
