SUMMARY = "Haskell cprng-aes library development files"
DESCRIPTION = "This package provides the Haskell cprng-aes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-devel-0.6.1-5.2.aarch64.rpm"
RPM_HASH = "0618aaaab1d3f447fe2926c0bbe2d7f7d6a0859b610234a77f6de006b15cf509fb172c4694c9636d0d99015c0d485714840d02af6d8999b399c6f07a5de7ca2d"

RPROVIDES:${PN} += "ghc-cprng-aes-devel \
ghc-devel-cprng-aes-0.6.1-AH5syEkNtcCLtLNSEwAncX"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cprng-aes \
ghc-devel-base-4.17.2.0 \
ghc-devel-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cipher-aes-0.2.11-J6Bfrfqg5Tl79OIpP67OVG \
ghc-devel-crypto-random-0.0.9-EARwXMpyWawUPhdi0weks"

inherit rpm
