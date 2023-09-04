SUMMARY = "Haskell hinotify library development files"
DESCRIPTION = "This package provides the Haskell hinotify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-hinotify-devel-0.4.1-3.4.aarch64.rpm"
RPM_HASH = "c33f8d3a1433027e277d91648cbb24d0a7e1eb9c42b58e990446b97b208d98dfde7f66117b7870d5ed535ca42b2d09686a13c85ed9fed3215e65bf8e7c546456"

RPROVIDES:${PN} += "ghc-devel-hinotify-0.4.1-JFQ6DOM0mgyCikOfj8YmfP \
ghc-hinotify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-unix-2.7.3 \
ghc-hinotify"

inherit rpm
