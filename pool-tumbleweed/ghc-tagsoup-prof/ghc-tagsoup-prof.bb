SUMMARY = "Haskell tagsoup profiling library"
DESCRIPTION = "This package provides the Haskell tagsoup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-prof-0.14.8-6.3.aarch64.rpm"
RPM_HASH = "9a2387171a14e6ed2040a5822ac8c45c9aa5e34420002c1c6e23a7e377a200d3c1e3aeaf580a8cf18fb55365827282fa237d8d1a1eaa2272cf524df8df0fcf6e"

RPROVIDES:${PN} += "ghc-prof(tagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn) \
ghc-tagsoup-prof \
ghc-tagsoup-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(text-2.0.2) \
ghc-tagsoup-devel"

inherit rpm
