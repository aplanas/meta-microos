SUMMARY = "Haskell X11-xft profiling library"
DESCRIPTION = "This package provides the Haskell X11-xft profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-prof-0.3.4-2.2.aarch64.rpm"
RPM_HASH = "06a33145042ea9ff3ae0137acbccd6baaa65b004e4c88384de3b84a9daa39658139595e64c0db43c86789df786b1da2ffb10de021ac92c262d3e977812273fdf"

RPROVIDES:${PN} += "ghc-X11-xft-prof ghc-X11-xft-prof(aarch-64) ghc-prof(X11-xft-0.3.4-OhtRmEXzW0LH0wgHeCCWq)"
RDEPENDS:${PN} += "ghc-X11-xft-devel ghc-prof(X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX) ghc-prof(base-4.17.1.0) ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q)"

inherit rpm
