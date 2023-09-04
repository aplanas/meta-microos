SUMMARY = "Haskell cprng-aes profiling library"
DESCRIPTION = "This package provides the Haskell cprng-aes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-prof-0.6.1-5.2.aarch64.rpm"
RPM_HASH = "0b402dfd67da0aaec4ec8ebece7eb4dbf52ffb67db1b02ec2f0bcfabf481fe07633878fe723e9e196595dfaf9216c057a4bb8b2543a7d80749dcbfc490443b12"

RPROVIDES:${PN} += "ghc-cprng-aes-prof \
ghc-prof-cprng-aes-0.6.1-AH5syEkNtcCLtLNSEwAncX"

RDEPENDS:${PN} += "ghc-cprng-aes-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cipher-aes-0.2.11-J6Bfrfqg5Tl79OIpP67OVG \
ghc-prof-crypto-random-0.0.9-EARwXMpyWawUPhdi0weks"

inherit rpm
