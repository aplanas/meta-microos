SUMMARY = "Haskell ghc-lib-parser-ex library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library development \
files."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-devel-9.4.0.0-1.11.aarch64.rpm"
RPM_HASH = "8f28d0699e9c6d2425ffbdee9ed9cdbaa223fb6edd242d9f98439d8f56cfa70ad2efdc9e075e357ef27e02cb4564a691118c464b06e43321787e27431d3b2ce7"

RPROVIDES:${PN} += "ghc-devel-ghc-lib-parser-ex-9.4.0.0-FnsACeicRjR9lrHyF5i7Lw \
ghc-ghc-lib-parser-ex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-lib-parser-9.4.6.20230808-BTkqGaXXohb8duAYJJlTmh \
ghc-devel-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX \
ghc-ghc-lib-parser-ex"

inherit rpm
