SUMMARY = "Haskell concurrent-output profiling library"
DESCRIPTION = "This package provides the Haskell concurrent-output profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.10.17"

RPM_NAME = "ghc-concurrent-output-prof-1.10.17-2.3.aarch64.rpm"
RPM_HASH = "8dc9d6c97b25b0a90670954cbd62e37e119417b82ea5abd197ed4076d4abe39ef087369462292ad5e0c010a45411da948f28fc2229c3d0cd8b470b800a414d92"

RPROVIDES:${PN} += "ghc-concurrent-output-prof ghc-concurrent-output-prof(aarch-64) ghc-prof(concurrent-output-1.10.17-8XvoUl0e7ll2y9NMBdkV0e)"
RDEPENDS:${PN} += "ghc-concurrent-output-devel ghc-prof(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) ghc-prof(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) ghc-prof(base-4.17.1.0) ghc-prof(directory-1.3.7.1) ghc-prof(exceptions-0.10.5) ghc-prof(process-1.6.16.0) ghc-prof(stm-2.5.1.0) ghc-prof(terminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-2.7.3)"

inherit rpm
