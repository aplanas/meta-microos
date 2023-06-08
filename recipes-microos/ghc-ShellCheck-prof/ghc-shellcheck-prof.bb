SUMMARY = "Haskell ShellCheck profiling library"
DESCRIPTION = "This package provides the Haskell ShellCheck profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-prof-0.9.0-2.3.aarch64.rpm"
RPM_HASH = "5c65e53b3c8b84d5674b3dd5b9102aa764d8bde1c109d996220566cd47f7dd8963c709afaead0b5206ae021891c3f2c87d70a77d390251dcfa3eb9f63d96df8a"

RPROVIDES:${PN} += "ghc-ShellCheck-prof ghc-ShellCheck-prof(aarch-64) ghc-prof(ShellCheck-0.9.0-DdkSsqjqnem8sl1ZfVxG9G)"
RDEPENDS:${PN} += "ghc-ShellCheck-devel ghc-prof(Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP) ghc-prof(QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6) ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(directory-1.3.7.1) ghc-prof(fgl-5.8.0.0-1euDADByC3LGFbnFGelVpn) ghc-prof(filepath-1.4.2.2) ghc-prof(mtl-2.2.2) ghc-prof(parsec-3.1.16.1) ghc-prof(process-1.6.16.0) ghc-prof(regex-tdfa-1.3.2-CiIqW6NRXBXL0jfv03YXoU) ghc-prof(transformers-0.5.6.2)"

inherit rpm
