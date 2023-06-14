SUMMARY = "Haskell echo profiling library"
DESCRIPTION = "This package provides the Haskell echo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-prof-0.1.4-2.2.aarch64.rpm"
RPM_HASH = "c1f92b3559b91d06d5275bb924cc3944b71d15edb7d5a1369f485077030be6c54eef700a877519e21ac05573cabc9a11957975b76d204fc2ac6a303a7d19cbf3"

RPROVIDES:${PN} += "ghc-echo-prof \
ghc-prof-echo-0.1.4-GGh6ZLKme4z6jywDiYhFOL"

RDEPENDS:${PN} += "ghc-echo-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-process-1.6.16.0"

inherit rpm
