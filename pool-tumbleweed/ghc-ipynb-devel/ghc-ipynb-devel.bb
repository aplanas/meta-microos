SUMMARY = "Haskell ipynb library development files"
DESCRIPTION = "This package provides the Haskell ipynb library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-devel-0.2-2.6.aarch64.rpm"
RPM_HASH = "5863db27e37f775af785b6d29df5020e5f36994ce4d1763725b1faa6717b04bc6fe91c574736a06f8822487fe6755603ceeb7085af2bd51bbcbb9ff47e34cda1"

RPROVIDES:${PN} += "ghc-devel-ipynb-0.2-Ij25To1hTXLCW4aPHIgo1Y \
ghc-ipynb-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-ipynb"

inherit rpm
