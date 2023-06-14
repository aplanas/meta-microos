SUMMARY = "Lua module to work with file zips"
DESCRIPTION = "Module with function for creating, modifying, and extracting files from zip \
archives."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-zip-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "68d16ca9a51191eaac5a5d22ff01857f246779c29ab838fa6b1481f21ce98b0c12024b7d97bda8e461f8a3d03b2d9af44dd52f2fbf80a6c791884d805a4b8ff3"

RPROVIDES:${PN} += "ghc-hslua-module-zip \
libHShslua-module-zip-1.1.0-HbdBiDu9SYHDsbypcn78hx-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdigest-0.0.1.7-CCCN8814sFy3HuiyT8t94G-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so \
libHShslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A-ghc9.4.5.so \
libHShslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq-ghc9.4.5.so \
libHShslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl-ghc9.4.5.so \
libHShslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4-ghc9.4.5.so \
libHShslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj-ghc9.4.5.so \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSzip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
