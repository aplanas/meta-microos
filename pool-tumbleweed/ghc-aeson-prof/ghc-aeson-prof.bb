SUMMARY = "Haskell aeson profiling library"
DESCRIPTION = "This package provides the Haskell aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-prof-2.1.2.1-3.1.aarch64.rpm"
RPM_HASH = "10c391ba59561481a4ae53864ded2279513cf1a43bfe92a0395fbc6241ae940d9ffb841ea862dd6c449ae48e8b60d16ad767b3209d89e4845e990befc6b33344"

RPROVIDES:${PN} += "ghc-aeson-prof \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc"

RDEPENDS:${PN} += "ghc-aeson-devel \
ghc-prof-OneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI \
ghc-prof-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ \
ghc-prof-exceptions-0.10.5 \
ghc-prof-generically-0.1.1-CmULdC2547fBrHCkT48ujn \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-prof-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-semialign-1.3-6anmyujTzjW8JKdJGWMlmE \
ghc-prof-strict-0.5-430Uicv2DUP1jZqwf2ycOP \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-text-short-0.1.5-1JafpcPTh6A5I5aikDr3ez \
ghc-prof-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-prof-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-prof-time-1.12.2 \
ghc-prof-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-witherable-0.4.2-4so4KYid1UG9PchOfa6Iqw"

inherit rpm
