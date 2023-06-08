SUMMARY = "Haskell call-stack profiling library"
DESCRIPTION = "This package provides the Haskell call-stack profiling library."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-prof-0.4.0-2.3.aarch64.rpm"
RPM_HASH = "1b59ff702273bb8002fa240b8fe46145aecdacead16a3618f9c5f3b1b3c55e978b5459bfe1444b1f9f62813b51ac34f86c5856cf5ebcc77bab55b919d08c70e7"

RPROVIDES:${PN} += "ghc-call-stack-prof ghc-call-stack-prof(aarch-64) ghc-prof(call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk)"
RDEPENDS:${PN} += "ghc-call-stack-devel ghc-prof(base-4.17.1.0)"

inherit rpm
