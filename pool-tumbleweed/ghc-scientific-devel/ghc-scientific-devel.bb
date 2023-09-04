SUMMARY = "Haskell scientific library development files"
DESCRIPTION = "This package provides the Haskell scientific library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.7.0"

RPM_NAME = "ghc-scientific-devel-0.3.7.0-5.9.aarch64.rpm"
RPM_HASH = "bbc0c49c0999b229f47c322ae7d8f29aba119bf3795e6c66dc76528af053daa192d529a63aa319bd6cbda5ee39377710e2b4cfb94808f2371bdc451e3e42e295"

RPROVIDES:${PN} += "ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-scientific-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-integer-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-scientific"

inherit rpm
