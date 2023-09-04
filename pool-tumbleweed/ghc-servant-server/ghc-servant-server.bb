SUMMARY = "A family of combinators for defining webservices APIs and serving them"
DESCRIPTION = "A family of combinators for defining webservices APIs and serving them \
 \
You can learn about the basics in the \
<http://docs.servant.dev/en/stable/tutorial/index.html tutorial>. \
 \
<https://github.com/haskell-servant/servant/blob/master/servant-server/example/greet.hs \
Here> is a runnable example, with comments, that defines a dummy API and \
implements a webserver that serves this API, using this package. \
 \
<https://github.com/haskell-servant/servant/blob/master/servant-server/CHANGELOG.md \
CHANGELOG>."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-0.19.2-2.12.aarch64.rpm"
RPM_HASH = "bc9bd625438643b033bd8ccf98c9fd1005b906ababcb3324f0dd96833e5dcb28b09f2524ed9f5e577dd695d80880ee534aad52f72366a34b262b9b947a05d4e2"

RPROVIDES:${PN} += "ghc-servant-server \
libHSservant-server-0.19.2-7444o9ZjHDc4tKFECJOEz2-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSHUnit-1.6.2.0-3fsauNNRJvI5u5lqiyApf4-ghc9.4.6.so \
libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSQuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8-ghc9.4.6.so \
libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSaeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc-ghc9.4.6.so \
libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSappar-0.1.8-1lWb1vtDAvc6rz1D87iAo-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6-ghc9.4.6.so \
libHSasn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG-ghc9.4.6.so \
libHSasn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in-ghc9.4.6.so \
libHSassoc-1.1-J44kuPbAMT5GyespKCFdbT-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSattoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3-ghc9.4.6.so \
libHSattoparsec-0.14.4-LxL1eX1xmPCB2HEhQefy3f-attoparsec-internal-ghc9.4.6.so \
libHSattoparsec-iso8601-1.1.0.0-1OFsQ5gAnygIPmkbstF7Ta-ghc9.4.6.so \
libHSauto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1-ghc9.4.6.so \
libHSbase-compat-batteries-0.13.0-1Ph1BfbK1cK5KUnlnKWiGW-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbase64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbifunctors-5.5.15-KUw4gCd9iBfLph9IFStYJY-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h-ghc9.4.6.so \
libHSblaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX-ghc9.4.6.so \
libHSblaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9-ghc9.4.6.so \
libHSboring-0.2.1-8UoR96J8uAp13B13xTdCnI-ghc9.4.6.so \
libHSbsb-http-chunked-0.0.0.4-6Uz6ZfX3tBC2nOluTU0Lnf-ghc9.4.6.so \
libHSbyteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScall-stack-0.4.0-nQZfFxinEdIa1BWxMyadt-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHSconstraints-0.13.4-7HFJx00f7ri8MCLIfNZmvk-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHScookie-0.4.6-7v2XoXnZEAdFFWtj85fg3L-ghc9.4.6.so \
libHScryptonite-0.30-LSC76M64GQaFgLGwFfgIgW-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdata-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es-ghc9.4.6.so \
libHSdec-0.0.5-3eH9is9HBV5IuOX3KX0Ah7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSeasy-file-0.2.5-IptebCGkAyyEfjLBFFjLI-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi-ghc9.4.6.so \
libHSfile-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSgenerically-0.1.1-CmULdC2547fBrHCkT48ujn-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShourglass-0.2.12-DDTIHdRSu369xxYEqSFzho-ghc9.4.6.so \
libHShttp-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy-ghc9.4.6.so \
libHShttp-date-0.0.11-HoNgmNPQQe1ErFjujEoPyv-ghc9.4.6.so \
libHShttp-media-0.8.0.0-5rJoZcqaWn0K15WzbWDvFb-ghc9.4.6.so \
libHShttp-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p-ghc9.4.6.so \
libHShttp2-3.0.3-41eYSHbDrcoAjUXjlws3pm-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSindexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ-ghc9.4.6.so \
libHSinteger-gmp-1.1-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSiproute-1.7.12-A34D1N9dJmL5ps3agDCHa7-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSmime-types-0.1.1.0-oV8uh4Pssd1mRIrSbk6Ab-ghc9.4.6.so \
libHSmmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn-ghc9.4.6.so \
libHSmonad-control-1.0.3.1-CVPvK8bh5F0Gvv9Wu0W98B-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSnetwork-byte-order-0.1.6-vRMRsceTnFFPQXnTdvJFs-ghc9.4.6.so \
libHSnetwork-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSold-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw-ghc9.4.6.so \
libHSoptparse-applicative-0.18.1.0-7FhZIXYdOMtK1gl2fqKmzm-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpem-0.2.4-F5Ih0vrB4sf5XALvrxfus2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB-ghc9.4.6.so \
libHSprettyprinter-ansi-terminal-1.1.3-3IupTJ2X3shLTeXNz5r5E2-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSpsqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSrecv-0.1.0-E4Of8dJv2WfHRGIVsQUgMj-ghc9.4.6.so \
libHSresourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP-ghc9.4.6.so \
libHSsafe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHSsemialign-1.3-6anmyujTzjW8JKdJGWMlmE-ghc9.4.6.so \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so \
libHSservant-0.19.1-3gX0IvlAojJFGwbp2bDTQF-ghc9.4.6.so \
libHSsimple-sendfile-0.2.32-Jkz6BAomm8GAcovJHWebTs-ghc9.4.6.so \
libHSsingleton-bool-0.1.6-32zI19nhSdNCZbR5BPJbeE-ghc9.4.6.so \
libHSsome-1.0.5-EryUniFNYOB2ktd7SoyKUW-ghc9.4.6.so \
libHSsop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSstreaming-commons-0.2.2.6-B2lYThdR4DPIZXSlcc8I7z-ghc9.4.6.so \
libHSstrict-0.5-430Uicv2DUP1jZqwf2ycOP-ghc9.4.6.so \
libHSstring-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStext-short-0.1.5-1JafpcPTh6A5I5aikDr3ez-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so \
libHSthese-1.2-5fSFdT8DGhg7GQONqvd4MR-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStime-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM-ghc9.4.6.so \
libHStime-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHStype-equality-1-GeDZojRKCH6645jDbV5JLU-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei-ghc9.4.6.so \
libHSunix-time-0.4.10-fuTENic3zHIuWAM5F0fYB-ghc9.4.6.so \
libHSunliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu-ghc9.4.6.so \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libHSuuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV-ghc9.4.6.so \
libHSvault-0.3.1.5-JTstBlaocLP2eokwHW0Uig-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSwai-3.2.3-JhFX1996sswH7nU4MZQSow-ghc9.4.6.so \
libHSwai-app-static-3.1.7.4-4gPGtaPPrElL5voDUXdKV2-ghc9.4.6.so \
libHSwai-extra-3.1.13.0-7b9ndOLV0UtHl4QVen1kNF-ghc9.4.6.so \
libHSwai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs-ghc9.4.6.so \
libHSwarp-3.3.25-9kawobphGNJ1pZTKG2KRtq-ghc9.4.6.so \
libHSwitherable-0.4.2-4so4KYid1UG9PchOfa6Iqw-ghc9.4.6.so \
libHSword8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD-ghc9.4.6.so \
libHSx509-1.7.7-2oKbMm4GXJUL45OKqbcDfn-ghc9.4.6.so \
libHSzlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj-ghc9.4.6.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libz.so.1"

inherit rpm
