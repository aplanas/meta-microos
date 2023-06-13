SUMMARY = "Haskell disk-free-space library development files"
DESCRIPTION = "This package provides the Haskell disk-free-space library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-devel-0.1.0.1-5.2.aarch64.rpm"
RPM_HASH = "2185fe6e4814c921301a3efc3a21f044c636c43480961351026e40bae97e02dbfb8e1628ada8ce28f9fcad0e1c9cadb24c7dc18d9ab707d002e7177b514577e9"

RPROVIDES:${PN} += "ghc-devel(disk-free-space-0.1.0.1-CGtWAgWYeLt876pNI1pHoX) \
ghc-disk-free-space-devel \
ghc-disk-free-space-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-disk-free-space"

inherit rpm
