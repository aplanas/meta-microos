SUMMARY = "A declarative terminal user interface library"
DESCRIPTION = "Write terminal user interfaces (TUIs) painlessly with 'brick'! You write an \
event handler and a drawing function and the library does the rest. \
 \
> module Main where > > import Brick > > ui :: Widget () > ui = str 'Hello, \
world!' > > main :: IO () > main = simpleMain ui \
 \
To get started, see: \
 \
* <https://github.com/jtdaugherty/brick/blob/master/README.md The README> \
 \
* The <https://github.com/jtdaugherty/brick/blob/master/docs/guide.rst Brick \
user guide> \
 \
* The demonstration programs in the 'programs' directory \
 \
This package deprecates <http://hackage.haskell.org/package/vty-ui vty-ui>."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-1.6-2.12.aarch64.rpm"
RPM_HASH = "ada0d446e6d6c806987bd3dc8bfb915b457e019c1b2d309751103721c94c781d1c259f67eb7cec6c59e4cbdf71f96c703c897456c198d63f7b1002b729218fcd"

RPROVIDES:${PN} += "ghc-brick \
libHSbrick-1.6-F5erOer4ZSWDwKz5KL60D9-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbimap-0.5.0-2qQthh2dRFHF2jSbEkPfEn-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHSconfig-ini-0.2.6.0-HoJpnqrH2zF9Zc2bv1CbDm-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so \
libHSdata-clist-0.2-2XS2LK92Ow8274ZzRlQjKH-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so \
libHSmegaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49-ghc9.4.6.so \
libHSmicrolens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3-ghc9.4.6.so \
libHSmicrolens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h-ghc9.4.6.so \
libHSmicrolens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSparser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSscientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHSterminfo-0.4.1.5-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStext-zipper-0.12-H7IYZaS5uJc9wNiAP20WIH-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSvty-5.38-LhnNmnv8DxxD0eeAip9uJs-ghc9.4.6.so \
libHSword-wrap-0.5-6mKx5HwYguB2E3kl2rrPmY-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
