SUMMARY = "Haskell file-embed library development files"
DESCRIPTION = "This package provides the Haskell file-embed library development files."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-devel-0.0.15.0-2.3.aarch64.rpm"
RPM_HASH = "cd0dd65a72bda338e26f805d55261028a40511095057386bd4af723aa43eaa628613fdf9c0d0321655f45de1e3a2405f5ecb4298c38412c900d63ffe6ffad99d"

RPROVIDES:${PN} += "ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-file-embed-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-file-embed"

inherit rpm
