SUMMARY = "Haskell vector-algorithms library development files"
DESCRIPTION = "This package provides the Haskell vector-algorithms library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.9.0.1"

RPM_NAME = "ghc-vector-algorithms-devel-0.9.0.1-1.6.aarch64.rpm"
RPM_HASH = "53747495f42e2c62118fa86139e5dad91ce42246c46a1a309c54dfbda117374eb78738dad3b528794d9fe60351a0f8c81281b70044c9037050f1f510a5e89060"

RPROVIDES:${PN} += "ghc-devel-vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6 \
ghc-vector-algorithms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-vector-algorithms"

inherit rpm
