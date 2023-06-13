SUMMARY = "Haskell ansi-wl-pprint library development files"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-devel-0.6.9-10.2.aarch64.rpm"
RPM_HASH = "8c1697c53ba81ea39f5605b94f658f170f36acd83f28e0abc1a3944dcc5053d021ef0a32122275ca5835614da0c5e17b2f8e8d54522ee4bf7ad6785d240ec049"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-devel \
ghc-ansi-wl-pprint-devel(aarch-64) \
ghc-devel(ansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI)"

RDEPENDS:${PN} += "/bin/sh \
ghc-ansi-wl-pprint \
ghc-compiler \
ghc-devel(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-devel(base-4.17.1.0)"

inherit rpm
