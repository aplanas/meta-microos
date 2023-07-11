SUMMARY = "Haskell safe library development files"
DESCRIPTION = "This package provides the Haskell safe library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-devel-0.3.19-4.6.aarch64.rpm"
RPM_HASH = "7793172ff66192fad337fbdc12cd1e6ba8e6fd9482770bc5324c54a927da6ccf273d8846796d9431eca385d0b0f00ea939622ce09d9a44d6e90878398d1295c2"

RPROVIDES:${PN} += "ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-safe-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-safe"

inherit rpm
