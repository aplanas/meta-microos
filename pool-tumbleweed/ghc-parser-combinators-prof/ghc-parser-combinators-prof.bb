SUMMARY = "Haskell parser-combinators profiling library"
DESCRIPTION = "This package provides the Haskell parser-combinators profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-prof-1.3.0-2.3.aarch64.rpm"
RPM_HASH = "3f91046c29aed7710a900f7b1acc65cb0d08a5349816db8779b9af79ddf5237ccded541ac5872944809bc7b8ad4cb8ed8057188366b58e84fdf67b02eb0ec2fc"

RPROVIDES:${PN} += "ghc-parser-combinators-prof \
ghc-parser-combinators-prof(aarch-64) \
ghc-prof(parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt)"

RDEPENDS:${PN} += "ghc-parser-combinators-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
