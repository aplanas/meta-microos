SUMMARY = "Haskell SafeSemaphore library development files"
DESCRIPTION = "This package provides the Haskell SafeSemaphore library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-devel-0.10.1-5.3.aarch64.rpm"
RPM_HASH = "131e012300b327292fe56babeb3b1d3814193a84195b4ac50b039ec5965aa551aeb42fc4c204e6b29f8c6b905ca053f924a55d89f7a4061e44494604e62aa3db"

RPROVIDES:${PN} += "ghc-SafeSemaphore-devel \
ghc-SafeSemaphore-devel(aarch-64) \
ghc-devel(SafeSemaphore-0.10.1-4RgR0Mf1NXcDYTDfcuJnia)"
RDEPENDS:${PN} += "/bin/sh \
ghc-SafeSemaphore \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(stm-2.5.1.0)"

inherit rpm
