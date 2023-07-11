SUMMARY = "Haskell hslua-module-doclayout library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout library \
development files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-devel-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "fcb69686c973a70ed369618613fb0e93a8dff6f984e1608254beee1439f84d3ec2e4e6880b6999144f54c0d1e3d151beefa27925fd1ce28cb31c3c8d29295b77"

RPROVIDES:${PN} += "ghc-devel-hslua-module-doclayout-1.1.0-whScExHkOx9DJU69TzJBc \
ghc-hslua-module-doclayout-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-devel-hslua-2.3.0-AU21dADSMqd8jVkw5fw6gb \
ghc-devel-text-2.0.2 \
ghc-hslua-module-doclayout"

inherit rpm
