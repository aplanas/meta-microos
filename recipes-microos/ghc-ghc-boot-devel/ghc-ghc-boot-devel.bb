SUMMARY = "Haskell ghc-boot library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-devel-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "6f575e1144a4d8118527742c5cf9ba25023cf0ac3bdc3bcefa9f87883c01a4693ec5bb03c694efc4c27d62175d7eb0bc8d3b1ad3169e6a3641184a7e2bb4d754"

RPROVIDES:${PN} += "ghc-devel(ghc-boot-9.4.5) ghc-ghc-boot-devel ghc-ghc-boot-devel(aarch-64) ghc-ghc-boot-static ghc-ghc-boot-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(filepath-1.4.2.2) ghc-devel(ghc-boot-th-9.4.5) ghc-devel(unix-2.7.3) ghc-ghc-boot(aarch-64)"

inherit rpm
