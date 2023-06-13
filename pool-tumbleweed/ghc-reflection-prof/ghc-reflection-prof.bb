SUMMARY = "Haskell reflection profiling library"
DESCRIPTION = "This package provides the Haskell reflection profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-reflection-prof-2.1.7-1.2.aarch64.rpm"
RPM_HASH = "cd1f55a3629e98541ed0ae23456789fea105c4f74c277be67625a35b8e5a6249eb2f5f02350c1affa01a8e0d94de99f05df6bcaa8669c83bf0532c56fa62b89b"

RPROVIDES:${PN} += "ghc-prof(reflection-2.1.7-KcOWE7PS1mHy6gA2edHvV) \
ghc-reflection-prof \
ghc-reflection-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-reflection-devel"

inherit rpm
