SUMMARY = "Haskell glib library development files"
DESCRIPTION = "This package provides the Haskell glib library development files."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-glib-devel-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "b73365485f6179e9b6b4920f69d01dbe0b0c8e25ee98e33d1bfe4e200b867e5cc0c885cad140cd14c69ac5426d706d3581ed8ba32273422a66f84819338fee87"

RPROVIDES:${PN} += "ghc-devel(glib-0.13.8.2-DQyux8etmkJKUbOUWF524Z) \
ghc-glib-devel \
ghc-glib-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(text-2.0.2) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-glib \
pkgconfig \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
