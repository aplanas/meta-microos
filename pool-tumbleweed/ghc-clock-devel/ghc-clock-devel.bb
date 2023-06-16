SUMMARY = "Haskell clock library development files"
DESCRIPTION = "This package provides the Haskell clock library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.3"

RPM_NAME = "ghc-clock-devel-0.8.3-2.2.aarch64.rpm"
RPM_HASH = "4d5306986b53791c64e4c861cba2fa705e263a02c8bc440437d569c86e1c4c4f7b29248a8992400a30abeab019463c60657a731edad89a67bb9faefde32068cc"

RPROVIDES:${PN} += "ghc-clock-devel \
ghc-devel-clock-0.8.3-Bn4LVnP2KGzGGqLjq4BuLV"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-clock \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
