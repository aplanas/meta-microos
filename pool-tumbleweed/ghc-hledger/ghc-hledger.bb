SUMMARY = "Haskell hledger library"
DESCRIPTION = "This package provides the Haskell hledger shared library."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-1.28-3.9.aarch64.rpm"
RPM_HASH = "0dc6d1a7c1ae7e4006cc532082cf812787812901884da6167c974c71596417c6af2d54ea7486a6a966c04eb156f766ce168f7da342e58488dfb30976afcb0055"

RPROVIDES:${PN} += "ghc-hledger \
libHShledger-1.28-BB0TqpU146rHgefpsST3hh-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSDecimal-0.5.2-7hu5LwisxJT2rqtwM7eQhT-ghc9.4.6.so \
libHSDiff-0.4.1-LhFtxwvuVVqGkTz0Ph6iJg-ghc9.4.6.so \
libHSGlob-0.10.2-96NxBWCYICFFsqKvc9eqpc-ghc9.4.6.so \
libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSOnly-0.1-qCrN026ulaL2ZFxnlcrV1-ghc9.4.6.so \
libHSQuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8-ghc9.4.6.so \
libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSaeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc-ghc9.4.6.so \
libHSaeson-pretty-0.8.10-BAp1RojEa5O2Gd1gxmbgJk-ghc9.4.6.so \
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
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so \
libHSblaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii-ghc9.4.6.so \
libHSblaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScall-stack-0.4.0-nQZfFxinEdIa1BWxMyadt-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP-ghc9.4.6.so \
libHScassava-megaparsec-2.0.4-C7KekE0MHcyFXF3lsApNgX-ghc9.4.6.so \
libHSclock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W-ghc9.4.6.so \
libHScmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHScontrol-monad-free-0.6.2-14mRW5Z3hOW3y0QtFAGsp6-ghc9.4.6.so \
libHScsv-0.1.2-D7ZtQLgQlciDV3aF4oWKCf-ghc9.4.6.so \
libHSdata-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdata-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1-ghc9.4.6.so \
libHSdata-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk-ghc9.4.6.so \
libHSdata-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I-ghc9.4.6.so \
libHSdata-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSdoclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc-ghc9.4.6.so \
libHSemojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSextra-1.7.14-DfcUn0kURmM7zhMG6RTp91-ghc9.4.6.so \
libHSfile-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSgenerically-0.1.1-CmULdC2547fBrHCkT48ujn-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSgithash-0.1.7.0-AdGnnqehkm8HwhDMWfn4qF-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShashtables-1.3.1-1KAEkULYvDmJLM8wOJL96T-ghc9.4.6.so \
libHShaskeline-0.8.2-ghc9.4.6.so \
libHShledger-lib-1.28-Bb3X1scVuGZKsjeiDSJIAh-ghc9.4.6.so \
libHShtml-1.0.1.2-Ei0LKBl3CyAHMF3GZI2hqu-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSindexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSlucid-2.11.20230408-4cKgK8hqgER6myHRF5jLTD-ghc9.4.6.so \
libHSmath-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR-ghc9.4.6.so \
libHSmegaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49-ghc9.4.6.so \
libHSmicrolens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3-ghc9.4.6.so \
libHSmicrolens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF-ghc9.4.6.so \
libHSmmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSoptparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSparser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSpretty-simple-4.1.2.0-I6NsimDP7f2Fl43nYTpHWu-ghc9.4.6.so \
libHSprettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB-ghc9.4.6.so \
libHSprettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSregex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae-ghc9.4.6.so \
libHSregex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM-ghc9.4.6.so \
libHSsafe-0.3.19-9uHvZjuyLiR13wOGSONZxX-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHSsemialign-1.3-6anmyujTzjW8JKdJGWMlmE-ghc9.4.6.so \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so \
libHSshakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem-ghc9.4.6.so \
libHSsplit-0.2.3.5-J6pekuQs6yKFxqDJQyglHu-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSstrict-0.5-430Uicv2DUP1jZqwf2ycOP-ghc9.4.6.so \
libHStabular-0.2.2.8-6UpIsHxi6ag26Q8LzRReTM-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR-ghc9.4.6.so \
libHStasty-hunit-0.10.0.3-2hefb6clI09Drjkc6dw6d8-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStemporary-1.3-Ezu2TwUgvSS2TpaVIHxXuR-ghc9.4.6.so \
libHSterminfo-0.4.1.5-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStext-short-0.1.5-1JafpcPTh6A5I5aikDr3ez-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so \
libHSth-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a-ghc9.4.6.so \
libHSthese-1.2-5fSFdT8DGhg7GQONqvd4MR-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStime-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM-ghc9.4.6.so \
libHStimeit-2.0-4alyyqlO7m4DFFkjYuUzq9-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSuglymemo-0.1.0.1-FaxrSjBe3XhIHSfEZHhJ9C-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libHSutility-ht-0.0.17-7cPYZhnhJbDGSMxoZBrT62-ghc9.4.6.so \
libHSuuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSwitherable-0.4.2-4so4KYid1UG9PchOfa6Iqw-ghc9.4.6.so \
libHSwizards-1.0.3-4dF6xVc0i30CRerGIMRP2J-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
