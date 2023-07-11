SUMMARY = "Utilities for indexed profunctors"
DESCRIPTION = "This package contains basic definitions related to indexed profunctors. \
These are primarily intended as internal utilities to support the 'optics' and \
'generic-lens' package families."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-0.1.1.1-1.1.aarch64.rpm"
RPM_HASH = "74c508ad2a067ee9a6b06faedb9318dc40234e0278cc7ac73e005f3dc876d4f383e5a19d35bc3085fd968de297e56ae16960d85c4b58a225b13f8158d12fadf3"

RPROVIDES:${PN} += "ghc-indexed-profunctors \
libHSindexed-profunctors-0.1.1.1-6bLFHbFbToS4H5mdmvIfka-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
