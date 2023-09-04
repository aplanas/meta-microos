SUMMARY = "Haskell glib library development files"
DESCRIPTION = "This package provides the Haskell glib library development files."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-glib-devel-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "86cf737570f586e7d80f281910fd2ad7d4fa052bb8de30436b69634c62c97938e292de246f6d61935c32c694c8c357cc033db1e94b050f1aef36030de40aae2c"

RPROVIDES:${PN} += "ghc-devel-glib-0.13.10.0-FwtjszetdFF6KErN1CKeSg \
ghc-glib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-glib \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
