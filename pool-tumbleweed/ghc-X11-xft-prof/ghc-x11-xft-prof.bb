SUMMARY = "Haskell X11-xft profiling library"
DESCRIPTION = "This package provides the Haskell X11-xft profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-prof-0.3.4-2.3.aarch64.rpm"
RPM_HASH = "1d914c88f5287ff3110da52d809c6b48ae0837d43767a62ea2e42a6093205c23f65136e9ae817e2a200f4b6cc03af4737420648bfbf2f2af6d1641013fda0497"

RPROVIDES:${PN} += "ghc-X11-xft-prof \
ghc-prof-X11-xft-0.3.4-7SpxQIcr2IsKaDkpOrx1dS"

RDEPENDS:${PN} += "ghc-X11-xft-devel \
ghc-prof-X11-1.10.3-1a2wZgfFAzXBkfyYtNRHp4 \
ghc-prof-base-4.17.2.0 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
