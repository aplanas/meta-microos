SUMMARY = "Haskell deriving-aeson profiling library"
DESCRIPTION = "This package provides the Haskell deriving-aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-prof-0.2.9-2.3.aarch64.rpm"
RPM_HASH = "0515c470ab70bddfb99bff7dd3e34ded9eb192f8053ba7ffa7ecb0de9bf7a5566ee4eb72a4a197a3ed7e5eb8ea601e63756f2f513b0e5e4560db3e68e7b7cc91"

RPROVIDES:${PN} += "ghc-deriving-aeson-prof \
ghc-prof-deriving-aeson-0.2.9-H4zgwfPBYrUGAqouOy9tcC"

RDEPENDS:${PN} += "ghc-deriving-aeson-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0"

inherit rpm
