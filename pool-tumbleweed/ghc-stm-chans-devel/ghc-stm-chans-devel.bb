SUMMARY = "Haskell stm-chans library development files"
DESCRIPTION = "This package provides the Haskell stm-chans library development files."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-devel-3.0.0.9-1.3.aarch64.rpm"
RPM_HASH = "39b54b9d6086c6c25496b0404ad28c2af5831a1f4d9bab7792a10f2b63ca8617d4030ee12189c219276cd3bdff99d13ef36a44f679fcc7150a5073c1de191d33"

RPROVIDES:${PN} += "ghc-devel(stm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R) \
ghc-stm-chans-devel \
ghc-stm-chans-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(stm-2.5.1.0) \
ghc-stm-chans"

inherit rpm
