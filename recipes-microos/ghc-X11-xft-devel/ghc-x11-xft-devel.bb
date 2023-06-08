SUMMARY = "Haskell X11-xft library development files"
DESCRIPTION = "This package provides the Haskell X11-xft library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-devel-0.3.4-2.2.aarch64.rpm"
RPM_HASH = "7c50335fafa5085b7ec748d56856631944e9287db30abd9d599cdb2c51222f4f5a18a85bfafa693de80fafc059ed81f19c2d249d6daabbf3c57ba711fceb5d2f"

RPROVIDES:${PN} += "ghc-X11-xft-devel ghc-X11-xft-devel(aarch-64) ghc-devel(X11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq)"
RDEPENDS:${PN} += "/bin/sh ghc-X11-xft ghc-compiler ghc-devel(X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX) ghc-devel(base-4.17.1.0) ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) pkgconfig pkgconfig(xft)"

inherit rpm
