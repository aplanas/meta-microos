SUMMARY = "Haskell http-media profiling library"
DESCRIPTION = "This package provides the Haskell http-media profiling library."
LICENSE = "MIT"

PV = "0.8.1.0"

RPM_NAME = "ghc-http-media-prof-0.8.1.0-1.1.aarch64.rpm"
RPM_HASH = "465b49e9faf5ddd41fe99a5ecd6cf77fda0e3faa3b77d112b7891f344d25baf5e432b381baeff9c062adf483bff52af2dbd49a9733ae2f1345276268735c9213"

RPROVIDES:${PN} += "ghc-http-media-prof \
ghc-prof-http-media-0.8.1.0-COFozQnKf3L2ra0cnOflYd"

RDEPENDS:${PN} += "ghc-http-media-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
