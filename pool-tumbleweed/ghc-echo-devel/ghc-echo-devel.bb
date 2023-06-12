SUMMARY = "Haskell echo library development files"
DESCRIPTION = "This package provides the Haskell echo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-devel-0.1.4-2.2.aarch64.rpm"
RPM_HASH = "08e45003e2219bdff4578054401c0a614c0bbb70b22fa616e4cf7ce60c62e670024d2ed960627bfc5097f6965e155a7cb941e0968f12713cdd67c81a5648b852"

RPROVIDES:${PN} += "ghc-devel(echo-0.1.4-GGh6ZLKme4z6jywDiYhFOL) \
ghc-echo-devel \
ghc-echo-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(process-1.6.16.0) \
ghc-echo"

inherit rpm
