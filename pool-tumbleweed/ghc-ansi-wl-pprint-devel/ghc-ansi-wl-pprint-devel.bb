SUMMARY = "Haskell ansi-wl-pprint library development files"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-devel-0.6.9-11.1.aarch64.rpm"
RPM_HASH = "19ba2360161cc07873278f7a43892badde2ed100dcf0029150f21b247459589366ab6c29b329d225dd55101b4d9841d80f77dbbc83209107560dc5a65e03cced"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-devel \
ghc-devel-ansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ansi-wl-pprint \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0"

inherit rpm
