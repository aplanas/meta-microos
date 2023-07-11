SUMMARY = "Haskell terminfo library development files"
DESCRIPTION = "This package provides the Haskell terminfo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-devel-0.4.1.5-3.2.aarch64.rpm"
RPM_HASH = "4829e5db5d634a38f685ad893f2392d70ccf8d11af1d3485abe510f89d150a9ea4415b6db003dfc23854fc8356d0cab5cf9c7c82a87e1ad48d7b9c7a2b1f46b7"

RPROVIDES:${PN} += "ghc-devel-terminfo-0.4.1.5 \
ghc-terminfo-devel \
ghc-terminfo-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-terminfo \
ncurses-devel"

inherit rpm
