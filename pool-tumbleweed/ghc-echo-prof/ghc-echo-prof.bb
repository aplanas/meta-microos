SUMMARY = "Haskell echo profiling library"
DESCRIPTION = "This package provides the Haskell echo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-prof-0.1.4-2.3.aarch64.rpm"
RPM_HASH = "8cfd18ea882cf244abe96dd2e16c5c239c8abe0292f0046d07f193d7c67009b9d1e5d58f333b39ef7804111a7330bb9499162c184359e71c0660eece6874c8c3"

RPROVIDES:${PN} += "ghc-echo-prof \
ghc-prof-echo-0.1.4-E70uPOVrrAEEin21p1eUkX"

RDEPENDS:${PN} += "ghc-echo-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-process-1.6.17.0"

inherit rpm
