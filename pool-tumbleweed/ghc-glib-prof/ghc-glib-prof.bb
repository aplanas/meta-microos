SUMMARY = "Haskell glib profiling library"
DESCRIPTION = "This package provides the Haskell glib profiling library."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-glib-prof-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "fa5f4e9f0df1c002b0598fb613e54b7fcb3d285e16922a982b079e3bd35c7c3d9da73987269aa5008869ae44022b797a2df7c271a7346c3d720ef1ea7ce027c6"

RPROVIDES:${PN} += "ghc-glib-prof \
ghc-prof-glib-0.13.10.0-3OTFLQKlfVK7JIaqsLt0K"

RDEPENDS:${PN} += "ghc-glib-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q"

inherit rpm
