SUMMARY = "Haskell pango profiling library"
DESCRIPTION = "This package provides the Haskell pango profiling library."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-pango-prof-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "d04b511be6b5a3c407bb9e3f223bd46f96b9c3721fa61ec112eb703860b72bc88d43dacc48a9b77ce120c4403914682768d8e8a4861c6d3ecd774b0decf5ebb2"

RPROVIDES:${PN} += "ghc-pango-prof \
ghc-prof-pango-0.13.8.2-AyE0ruIpbddIIASgXg66h2"

RDEPENDS:${PN} += "ghc-pango-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-cairo-0.13.8.2-84nOBKgVLz3788JDxxB5om \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-glib-0.13.8.2-DQyux8etmkJKUbOUWF524Z \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.16.0 \
ghc-prof-text-2.0.2"

inherit rpm
