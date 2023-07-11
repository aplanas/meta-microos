SUMMARY = "Haskell uuid library development files"
DESCRIPTION = "This package provides the Haskell uuid library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-devel-1.3.15-4.6.aarch64.rpm"
RPM_HASH = "f11d3fa3dbd407fbd760177dd8ee731bf89d32c21688c7c52faf400e8df0b7f0636282341c6834f5f52e741b73f5800fc2fb951159de96f3ec42c89cc4e242f7"

RPROVIDES:${PN} += "ghc-devel-uuid-1.3.15-LYRljjihV0KIEewDtLdQ17 \
ghc-uuid-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV \
ghc-devel-cryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb \
ghc-devel-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-devel-network-info-0.2.1-G9nMDkAKQecAEHIupCmq9I \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-uuid"

inherit rpm
