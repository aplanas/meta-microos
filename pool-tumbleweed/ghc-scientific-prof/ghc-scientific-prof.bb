SUMMARY = "Haskell scientific profiling library"
DESCRIPTION = "This package provides the Haskell scientific profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-prof-0.3.7.0-5.9.aarch64.rpm"
RPM_HASH = "20d8c3e46439e0c1e1f82e75515a20126c607c0ab655cb27db5bbfc60969ea237ed12942c09385a7069050c2b200c973f7228526568ace3d72526e09fa879746"

RPROVIDES:${PN} += "ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-scientific-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-integer-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-scientific-devel"

inherit rpm
