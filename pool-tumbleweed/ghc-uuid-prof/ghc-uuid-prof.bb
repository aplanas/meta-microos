SUMMARY = "Haskell uuid profiling library"
DESCRIPTION = "This package provides the Haskell uuid profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-prof-1.3.15-4.6.aarch64.rpm"
RPM_HASH = "e365b7cc1fcabf4ef325960232fd4c894f57b8c010522528eeff5e07986b2c3fe2c167a5e6ef62996c9610e230f44dbff4c518e94c54dff1660c0786c3ec5f88"

RPROVIDES:${PN} += "ghc-prof-uuid-1.3.15-LYRljjihV0KIEewDtLdQ17 \
ghc-uuid-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV \
ghc-prof-cryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb \
ghc-prof-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-prof-network-info-0.2.1-G9nMDkAKQecAEHIupCmq9I \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-uuid-devel"

inherit rpm
