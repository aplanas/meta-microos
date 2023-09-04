SUMMARY = "Haskell aeson library development files"
DESCRIPTION = "This package provides the Haskell aeson library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-devel-2.1.2.1-3.1.aarch64.rpm"
RPM_HASH = "8f3040287c00e7bd14c9bff6181eebba3a0ea1920002dca706bba86d5c4532075812cd1e870a7734ddd8d47e70f16ddd1a9bad0ae7ab6a52b8cc370f7d196d0d"

RPROVIDES:${PN} += "ghc-aeson-devel \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aeson \
ghc-compiler \
ghc-devel-OneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI \
ghc-devel-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8 \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ \
ghc-devel-exceptions-0.10.5 \
ghc-devel-generically-0.1.1-CmULdC2547fBrHCkT48ujn \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-semialign-1.3-6anmyujTzjW8JKdJGWMlmE \
ghc-devel-strict-0.5-430Uicv2DUP1jZqwf2ycOP \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-text-short-0.1.5-1JafpcPTh6A5I5aikDr3ez \
ghc-devel-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-devel-these-1.2-5fSFdT8DGhg7GQONqvd4MR \
ghc-devel-time-1.12.2 \
ghc-devel-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-witherable-0.4.2-4so4KYid1UG9PchOfa6Iqw"

inherit rpm
