SUMMARY = "Haskell appar library development files"
DESCRIPTION = "This package provides the Haskell appar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-devel-0.1.8-4.3.aarch64.rpm"
RPM_HASH = "cd724c80f389fa80c675dee212ceb496f75050ce50abdb8f979b923b549ebabcf6d437014860e9ac02cbd8adbbbd6d6caaf75a1299bf43dec32fa94976bd1e1b"

RPROVIDES:${PN} += "ghc-appar-devel \
ghc-devel-appar-0.1.8-1lWb1vtDAvc6rz1D87iAo"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-appar \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
