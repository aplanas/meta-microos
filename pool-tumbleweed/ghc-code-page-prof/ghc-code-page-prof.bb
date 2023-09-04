SUMMARY = "Haskell code-page profiling library"
DESCRIPTION = "This package provides the Haskell code-page profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-prof-0.2.1-2.7.aarch64.rpm"
RPM_HASH = "59273f7635bda4e952331d7e53f5193cc80bb6a2483401d14071a1da3c87f6d61c66787e24319ec985f1e6c878c7c30e4a6dac44d485669c447cde72e9d73426"

RPROVIDES:${PN} += "ghc-code-page-prof \
ghc-prof-code-page-0.2.1-FtqibIt49dG4EHKj0zD5sM"

RDEPENDS:${PN} += "ghc-code-page-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
