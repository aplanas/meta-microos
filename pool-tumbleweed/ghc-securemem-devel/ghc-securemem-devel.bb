SUMMARY = "Haskell securemem library development files"
DESCRIPTION = "This package provides the Haskell securemem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-devel-0.1.10-4.4.aarch64.rpm"
RPM_HASH = "f7c170c9d242f1fcae4c953789b66031b7bdba2ced96a342d15e2edadf890980b805af121b4516d0bd667dc8aca07c39038a0cb254ed740f11db075deb4d3941"

RPROVIDES:${PN} += "ghc-devel-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu \
ghc-securemem-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-securemem"

inherit rpm
