SUMMARY = "Haskell ghc library development files"
DESCRIPTION = "This package provides the Haskell ghc library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-devel-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "9d30a549bf606178ec4284a9d79293c00e7cf5708ac709d1c2ba229d63c5c4e1ff3c161a0bb304805a6f5c632519a52855fe353b0a9a36f032a7dd4223d4b188"

RPROVIDES:${PN} += "ghc-devel(ghc-9.4.5) ghc-ghc-devel ghc-ghc-devel(aarch-64) ghc-ghc-static ghc-ghc-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(exceptions-0.10.5) ghc-devel(filepath-1.4.2.2) ghc-devel(ghc-boot-9.4.5) ghc-devel(ghc-heap-9.4.5) ghc-devel(ghci-9.4.5) ghc-devel(hpc-0.6.1.0) ghc-devel(process-1.6.16.0) ghc-devel(stm-2.5.1.0) ghc-devel(template-haskell-2.19.0.0) ghc-devel(terminfo-0.4.1.5) ghc-devel(time-1.12.2) ghc-devel(transformers-0.5.6.2) ghc-devel(unix-2.7.3) ghc-ghc(aarch-64)"

inherit rpm
