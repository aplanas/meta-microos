SUMMARY = "Haskell ghc-boot-th profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-prof-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "8f9cb988979f9ed3f5de6959cc0861de69bd61ade2cdef532ed29e00e5b6065b4245323723644c7f6ed40fe0df98edfd752b246a7297e08295b3675c4e705b45"

RPROVIDES:${PN} += "ghc-ghc-boot-th-prof \
ghc-prof-ghc-boot-th-9.4.5"

RDEPENDS:${PN} += "ghc-ghc-boot-th-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
