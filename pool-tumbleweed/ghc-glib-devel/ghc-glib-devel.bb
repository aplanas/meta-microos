SUMMARY = "Haskell glib library development files"
DESCRIPTION = "This package provides the Haskell glib library development files."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-glib-devel-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "45d481eb25c3980d9addd24de895421cf088c4168403abe6ddb4cb6f07289d667d1c295fe2a93b3257a7e1c4f0e587c20b9946cfa43b7a337a6ccc6313b330d1"

RPROVIDES:${PN} += "ghc-devel-glib-0.13.10.0-3OTFLQKlfVK7JIaqsLt0K \
ghc-glib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-glib \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
