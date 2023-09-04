SUMMARY = "Haskell ilist profiling library"
DESCRIPTION = "This package provides the Haskell ilist profiling library."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-ilist-prof-0.4.0.1-2.1.aarch64.rpm"
RPM_HASH = "8556008bbda97e6a0a2b888202f599b1d6312286326a66e2d351166053bea65e6d875b1e8e9c8ee0a8cafd244403c6dd6d58f9d813c5ecdb52d66c17ebdb2c39"

RPROVIDES:${PN} += "ghc-ilist-prof \
ghc-prof-ilist-0.4.0.1-9dvbAvSibn3BQOkPCJFvsJ"

RDEPENDS:${PN} += "ghc-ilist-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
