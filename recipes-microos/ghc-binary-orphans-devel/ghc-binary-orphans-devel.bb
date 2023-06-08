SUMMARY = "Haskell binary-orphans library development files"
DESCRIPTION = "This package provides the Haskell binary-orphans library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.4.1"

RPM_NAME = "ghc-binary-orphans-devel-1.0.4.1-1.2.aarch64.rpm"
RPM_HASH = "828d12e4c7cbfa196e9ba234df1f6504cd427ee7981b39eb2be4a132759748de30c9bfd65e19e528b7daf8be9d451efeb70fc745b511ef66d3a8a933641994e7"

RPROVIDES:${PN} += "ghc-binary-orphans-devel ghc-binary-orphans-devel(aarch-64) ghc-devel(binary-orphans-1.0.4.1-B9MBRQ7HLuSFecvHRdMPIR)"
RDEPENDS:${PN} += "/bin/sh ghc-binary-orphans ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(transformers-0.5.6.2)"

inherit rpm
