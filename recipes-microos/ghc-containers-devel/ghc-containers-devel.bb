SUMMARY = "Haskell containers library development files"
DESCRIPTION = "This package provides the Haskell containers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-devel-0.6.7-1.1.aarch64.rpm"
RPM_HASH = "20874a8aed9b4df290cb5c4cd6847416b7d960859769f6e5edffbd4403a9e006b81dc4fcbbb576e28aebf2a0a481ae16cc04ecf75867c0005178ab20354f880e"

RPROVIDES:${PN} += "ghc-containers-devel ghc-containers-devel(aarch-64) ghc-containers-static ghc-containers-static(aarch-64) ghc-devel(containers-0.6.7)"
RDEPENDS:${PN} += "ghc-compiler ghc-containers(aarch-64) ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(template-haskell-2.19.0.0)"

inherit rpm
