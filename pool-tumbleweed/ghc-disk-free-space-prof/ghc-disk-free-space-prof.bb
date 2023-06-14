SUMMARY = "Haskell disk-free-space profiling library"
DESCRIPTION = "This package provides the Haskell disk-free-space profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-prof-0.1.0.1-5.2.aarch64.rpm"
RPM_HASH = "1ac67f1dcadf236ae48f8e405019800efbb1eb33abc37f4ab9fc284700882cc33dd82f8fb815fd03551359113f044f823e40143a7b986bb4e43d7fba4586a123"

RPROVIDES:${PN} += "ghc-disk-free-space-prof \
ghc-prof-disk-free-space-0.1.0.1-CGtWAgWYeLt876pNI1pHoX"

RDEPENDS:${PN} += "ghc-disk-free-space-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
