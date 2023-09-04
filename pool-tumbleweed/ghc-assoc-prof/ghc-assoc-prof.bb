SUMMARY = "Haskell assoc profiling library"
DESCRIPTION = "This package provides the Haskell assoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-assoc-prof-1.1-1.6.aarch64.rpm"
RPM_HASH = "ac2ebd6b02201f52ed21221643e2d144489592778f2c7c431d0043e561bc3196213196a98854986d47740ea3c3539f776b316f23461c12882633b03667c01624"

RPROVIDES:${PN} += "ghc-assoc-prof \
ghc-prof-assoc-1.1-J44kuPbAMT5GyespKCFdbT"

RDEPENDS:${PN} += "ghc-assoc-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax"

inherit rpm
