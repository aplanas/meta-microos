SUMMARY = "Haskell hlint library"
DESCRIPTION = "This package provides the Haskell hlint shared library."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "ghc-hlint-3.5-1.17.aarch64.rpm"
RPM_HASH = "c03d86e95d2c6228cb42408168f00b1153a5acd68387e09432aed93517b88fce98ce2ac46133f0ce44415433671fd05b1a5105c9a53ca0115142affc0f83ecac"

RPROVIDES:${PN} += "ghc-hlint \
libHShlint-3.5-4RmFhbheUGCL3K3OzJi0Yw-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSQuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8-ghc9.4.6.so \
libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSaeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc-ghc9.4.6.so \
libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSassoc-1.1-J44kuPbAMT5GyespKCFdbT-ghc9.4.6.so \
libHSattoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3-ghc9.4.6.so \
libHSattoparsec-0.14.4-LxL1eX1xmPCB2HEhQefy3f-attoparsec-internal-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1-ghc9.4.6.so \
libHSbase-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSclock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W-ghc9.4.6.so \
libHScmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHSconduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHScpphs-1.20.9.1-21Hm230EH4MCmgim8IB00q-ghc9.4.6.so \
libHSdata-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdata-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1-ghc9.4.6.so \
libHSdata-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk-ghc9.4.6.so \
libHSdata-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I-ghc9.4.6.so \
libHSdata-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSderiving-aeson-0.2.9-7GG7RbiGvWZJpJcDU5qu5W-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSextra-1.7.14-DfcUn0kURmM7zhMG6RTp91-ghc9.4.6.so \
libHSfile-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSfilepattern-0.1.3-4ntZdyOJ0RX8pGnFp1xRde-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSgenerically-0.1.1-CmULdC2547fBrHCkT48ujn-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-lib-parser-9.4.7.20230826-9jTyF2CzAjoBitf2gKlSVU-ghc9.4.6.so \
libHSghc-lib-parser-ex-9.4.0.0-5gI0mYE7T3L4MUgurM5BvD-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShscolour-1.24.4-LJeKwNXAf207wSFk6wkP8w-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSindexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSlibyaml-0.1.2-EDd2y61D5c93Khh6u4Ilj1-ghc9.4.6.so \
libHSmono-traversable-1.0.15.3-LJDObfSqMuwFAwfZMa8qoW-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpolyparse-1.13-BLB26XAC1GDzZMBJpPaUe-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSrefact-0.3.0.2-BDNu2wr6P751Tb9dT06Yg8-ghc9.4.6.so \
libHSresourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHSsemialign-1.3-6anmyujTzjW8JKdJGWMlmE-ghc9.4.6.so \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so \
libHSsplit-0.2.3.5-J6pekuQs6yKFxqDJQyglHu-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSstrict-0.5-430Uicv2DUP1jZqwf2ycOP-ghc9.4.6.so \
libHSsyb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStext-short-0.1.5-1JafpcPTh6A5I5aikDr3ez-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHSthese-1.2-5fSFdT8DGhg7GQONqvd4MR-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStime-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSuniplate-1.6.13-EEjCQACslljIQmS3K29CqX-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libHSuuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSwitherable-0.4.2-4so4KYid1UG9PchOfa6Iqw-ghc9.4.6.so \
libHSyaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libyaml-0.so.2"

inherit rpm
