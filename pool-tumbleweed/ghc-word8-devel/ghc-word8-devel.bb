SUMMARY = "Haskell word8 library development files"
DESCRIPTION = "This package provides the Haskell word8 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-devel-0.1.3-5.3.aarch64.rpm"
RPM_HASH = "73c6ad200c7ce77ffc62e268f6657c9da4c13a1687eecd1ac639dce2ce0510edb81ca08312a40b7c727f6c599cd4eb7b9469aace7a5f33201f0e37a37990ed3e"

RPROVIDES:${PN} += "ghc-devel-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-word8-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-word8"

inherit rpm
