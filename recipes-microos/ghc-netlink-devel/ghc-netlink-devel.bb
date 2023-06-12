SUMMARY = "Haskell netlink library development files"
DESCRIPTION = "This package provides the Haskell netlink library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-devel-1.1.1.0-4.3.aarch64.rpm"
RPM_HASH = "e317e45ff0c510d3f9d79589602821b318da5e7846310f2d413c2ee7e243617c08557ac246508f253fec8cd9b427da8324ac13839155f9ba67db1f647e39afa4"

RPROVIDES:${PN} += "ghc-devel(netlink-1.1.1.0-3cQkQWnXFQnLtl9CehLMU3) \
ghc-netlink-devel \
ghc-netlink-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-devel(containers-0.6.7) \
ghc-devel(monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9) \
ghc-devel(pretty-hex-1.1-2861Nkv8pS0CIRpZJwwJMG) \
ghc-devel(unix-2.7.3) \
ghc-netlink"

inherit rpm
