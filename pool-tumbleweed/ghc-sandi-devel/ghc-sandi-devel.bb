SUMMARY = "Haskell sandi library development files"
DESCRIPTION = "This package provides the Haskell sandi library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-devel-0.5-5.7.aarch64.rpm"
RPM_HASH = "f2e60e93ae7f0bd459c38acb4e57ca1de1ce7a90f8739228d8524acbdee15ace5dc272cdc678f54e1bcd18e4c41a3e04f1d0a3502b1cecc4d89c9d7e8494821e"

RPROVIDES:${PN} += "ghc-devel-sandi-0.5-YnddZGVezcGXuCMoeOLq4 \
ghc-sandi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-exceptions-0.10.5 \
ghc-sandi"

inherit rpm
