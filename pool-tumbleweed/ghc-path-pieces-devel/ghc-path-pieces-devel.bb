SUMMARY = "Haskell path-pieces library development files"
DESCRIPTION = "This package provides the Haskell path-pieces library development files."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-devel-0.2.1-12.2.aarch64.rpm"
RPM_HASH = "a1fe108ec2d2430310fe743b2b41ad816938a58b0533e81b25098a22a07e4e2153beda39a4636715cb9f6d2d97a00b477ce61e1a1dd23bb50b78fa2f3494ca1d"

RPROVIDES:${PN} += "ghc-devel(path-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4) \
ghc-path-pieces-devel \
ghc-path-pieces-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-path-pieces"

inherit rpm
