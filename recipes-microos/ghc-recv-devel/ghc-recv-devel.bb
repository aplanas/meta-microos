SUMMARY = "Haskell recv library development files"
DESCRIPTION = "This package provides the Haskell recv library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-devel-0.1.0-1.3.aarch64.rpm"
RPM_HASH = "cd0a5d17bd62cd2cf45985bda49d779c1df88edca005ad9da94327e8f978d8bbde1f48f7fa6f78dc0c8869129658dbdd909cffd65149f0e51cfbfdd752e6039f"

RPROVIDES:${PN} += "ghc-devel(recv-0.1.0-4koyrU2GJ4L4fpyKcXLbZR) \
ghc-recv-devel \
ghc-recv-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-recv"

inherit rpm
