SUMMARY = "Haskell sandi library development files"
DESCRIPTION = "This package provides the Haskell sandi library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-devel-0.5-5.11.aarch64.rpm"
RPM_HASH = "8f7e1bae947b7fb32a60523a555ed0cfdba9494ec9321e55e6458dfcb30d0ecdc83ef41586d18ad01eea64364157704c4a13eee0962285b60a860fdd0c3a41e8"

RPROVIDES:${PN} += "ghc-devel-sandi-0.5-4V55ws6mOby4WWuCXz9My4 \
ghc-sandi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-exceptions-0.10.5 \
ghc-sandi"

inherit rpm
