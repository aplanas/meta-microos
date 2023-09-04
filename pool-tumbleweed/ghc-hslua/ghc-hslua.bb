SUMMARY = "Bindings to Lua, an embeddable scripting language"
DESCRIPTION = "HsLua provides wrappers and helpers to bridge Haskell and <https://www.lua.org/ \
Lua>. \
 \
It builds upon the /lua/ package, which allows to bundle a Lua interpreter with \
a Haskell program. \
 \
Example programs are can be found in the 'hslua-examples' subdir of the project \
<https://github.com/hslua/hslua repository>."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "ae91604766f4dce6786bc1a7f2860504771fe23a14543e5e89ca6be2dd43e2cf69ecf399e8902190cc4730ffb2dd30242b5b444014fc573610fd9bc7a3d57658"

RPROVIDES:${PN} += "ghc-hslua \
libHShslua-2.3.0-IFweDrinoAduGRRaqkwGX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSOneTuple-0.4.1.1-5m1ALA0bqJEAQoyOrWBAgI-ghc9.4.6.so \
libHSQuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8-ghc9.4.6.so \
libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSaeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc-ghc9.4.6.so \
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
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScomonad-5.0.8-56nFbOwllOwBl7FMfSy83E-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHSdata-fix-0.3.2-Hesv2p3MUF3H2yKikhD4Es-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSfoldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy-ghc9.4.6.so \
libHSgenerically-0.1.1-CmULdC2547fBrHCkT48ujn-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShslua-aeson-2.3.0.1-GTKyJZd9E8T7sbi3aSnblh-ghc9.4.6.so \
libHShslua-classes-2.3.0-B1L4OZUPrf8GQ47NXlejyp-ghc9.4.6.so \
libHShslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk-ghc9.4.6.so \
libHShslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj-ghc9.4.6.so \
libHShslua-objectorientation-2.3.0-26R83mqcSjNC8MxfPJWYVS-ghc9.4.6.so \
libHShslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD-ghc9.4.6.so \
libHShslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn-ghc9.4.6.so \
libHSindexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO-ghc9.4.6.so \
libHSindexed-traversable-instances-0.1.1.2-4xmEkkFhOqh6ApH5IPswPQ-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSlua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHSsemialign-1.3-6anmyujTzjW8JKdJGWMlmE-ghc9.4.6.so \
libHSsemigroupoids-5.3.7-H606qAbQOgNCZ5aAzkCf0g-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHSstrict-0.5-430Uicv2DUP1jZqwf2ycOP-ghc9.4.6.so \
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
libHSunix-2.7.3-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSuuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSwitherable-0.4.2-4so4KYid1UG9PchOfa6Iqw-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
