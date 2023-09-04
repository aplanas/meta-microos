SUMMARY = "Haskell unordered-containers library development files"
DESCRIPTION = "This package provides the Haskell unordered-containers library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-devel-0.2.19.1-3.9.aarch64.rpm"
RPM_HASH = "71099ee195440f360a4269127fae29c294e6bf846bf57ebd5fb5c3b16a67a133d97295f06929469868cfecfe58c9664751b285da66d15635d6003c1679e734dd"

RPROVIDES:${PN} += "ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-unordered-containers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-template-haskell-2.19.0.0 \
ghc-unordered-containers"

inherit rpm
