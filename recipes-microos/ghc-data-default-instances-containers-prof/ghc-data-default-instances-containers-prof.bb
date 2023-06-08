SUMMARY = "Haskell data-default-instances-containers profiling library"
DESCRIPTION = "This package provides the Haskell data-default-instances-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-containers-prof-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "0fd8188d261a5b822767be57f735bccc2313f323147b0b66bb658ba0c931c9589e04f1873b583dabd8c7fe344787523f402505a7fa25bc7418dbcb9fa3dfb8c1"

RPROVIDES:${PN} += "ghc-data-default-instances-containers-prof ghc-data-default-instances-containers-prof(aarch-64) ghc-prof(data-default-instances-containers-0.0.1-GsTPO88BTeU5gVKxrRffFz)"
RDEPENDS:${PN} += "ghc-data-default-instances-containers-devel ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ)"

inherit rpm
