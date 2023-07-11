SUMMARY = "Haskell lukko profiling library"
DESCRIPTION = "This package provides the Haskell lukko profiling library."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-prof-0.1.1.3-5.6.aarch64.rpm"
RPM_HASH = "7332b88f9ca4cd5053566ea995c004fbafa7275578e681fe2be636a3f46289dc06f07314a0546c7c8e986c625be08f7aac98e2a849e79d69adb751a2d70a47e9"

RPROVIDES:${PN} += "ghc-lukko-prof \
ghc-prof-lukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V"

RDEPENDS:${PN} += "ghc-lukko-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
