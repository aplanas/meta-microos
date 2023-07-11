SUMMARY = "For creating, comparing, parsing and printing Universally Unique Identifiers"
DESCRIPTION = "This library is useful for creating, comparing, parsing and printing \
Universally Unique Identifiers. \
 \
See <http://en.wikipedia.org/wiki/UUID> for the general idea."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-1.3.15-4.6.aarch64.rpm"
RPM_HASH = "e484cef3fec0b1a0c6de2e4b1f22b97ea202c04664a76634fcf0e6a109340c05003ed8943ba2b9272507552b84b6a0ee0626373e8628a559b336d31d3d09d576"

RPROVIDES:${PN} += "ghc-uuid \
libHSuuid-1.3.15-LYRljjihV0KIEewDtLdQ17-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHScryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV-ghc9.4.5.so \
libHScryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSentropy-0.4.1.10-HkaMHQZP8nyRj15panvtP-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSnetwork-info-0.2.1-G9nMDkAKQecAEHIupCmq9I-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSuuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
