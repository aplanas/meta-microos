SUMMARY = "Haskell wai profiling library"
DESCRIPTION = "This package provides the Haskell wai profiling library."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-prof-3.2.3-2.3.aarch64.rpm"
RPM_HASH = "5ee1b18cdd3b1c65cf11f55d3f5814ddda0699786bb33afefeed7413ec855414baa59d92eb778f24d7d581cba1818391e1415578c99d668ded6ae84453d70d7a"

RPROVIDES:${PN} += "ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-wai-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-text-2.0.2 \
ghc-prof-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-wai-devel"

inherit rpm
