SUMMARY = "Haskell libiserv library development files"
DESCRIPTION = "This package provides the Haskell libiserv library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-devel-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "ae9e01177b07862438cc35a8d6435243c6ca4299ec1fe94458fd1e4a7b90c7aca43e3c1e971e1720a20681d692bdad731aa793b238c5f0cdf25dfe4bf4fc7772"

RPROVIDES:${PN} += "ghc-devel(libiserv-9.4.5) ghc-libiserv-devel ghc-libiserv-devel(aarch-64) ghc-libiserv-static ghc-libiserv-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(ghci-9.4.5) ghc-devel(unix-2.7.3) ghc-libiserv(aarch-64)"

inherit rpm
