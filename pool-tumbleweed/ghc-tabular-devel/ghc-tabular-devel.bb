SUMMARY = "Haskell tabular library development files"
DESCRIPTION = "This package provides the Haskell tabular library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-devel-0.2.2.8-4.6.aarch64.rpm"
RPM_HASH = "26ae2c1400a3c17ab97c92f051c18f74c8cd7c8fc9faf6c3c0a1062e5d4ae3f69b8bc9cadfdf88b952c26734e9772f1adb622a2e1a3b888e4b7e4a9ba3242d3f"

RPROVIDES:${PN} += "ghc-devel-tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp \
ghc-tabular-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-csv-0.1.2-LKioaw43aTAAAKpIk04xxN \
ghc-devel-html-1.0.1.2-U7qWIp0bJwCnAFPlj3UZy \
ghc-devel-mtl-2.2.2 \
ghc-tabular"

inherit rpm
