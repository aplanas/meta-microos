SUMMARY = "Haskell iwlib library development files"
DESCRIPTION = "This package provides the Haskell iwlib library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-devel-0.1.2-2.2.aarch64.rpm"
RPM_HASH = "935c76f766d0a38c6ad0861c61e057435378bd0a57139a94d07dce0ff77d706512413518cc7aeb0fc0a5a9521b10eede3cb16c29f13c8ac99ee08500142aea1d"

RPROVIDES:${PN} += "ghc-devel-iwlib-0.1.2-1s738Tb3Wf2CvjJviNtWBD \
ghc-iwlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-iwlib \
libiw-devel"

inherit rpm
