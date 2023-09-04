SUMMARY = "Haskell netlink library development files"
DESCRIPTION = "This package provides the Haskell netlink library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-devel-1.1.1.0-4.8.aarch64.rpm"
RPM_HASH = "20a679fa923ee4587e4cca3b2323d25f7ab8523517d04220bb2aaaa20cd41725ad7c8b82dd6ad3a0c99b6f2e9954ff39d64023f68c87ddc22e1050053b412af1"

RPROVIDES:${PN} += "ghc-devel-netlink-1.1.1.0-AkYwYtaCv1eG7Xks1z5IhU \
ghc-netlink-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-containers-0.6.7 \
ghc-devel-monad-loops-0.4.3-Hqvq9oJQAvl8Gm82ocTn8i \
ghc-devel-pretty-hex-1.1-6nqTsc1Xx7vJSzZ0xX5VyC \
ghc-devel-unix-2.7.3 \
ghc-netlink"

inherit rpm
