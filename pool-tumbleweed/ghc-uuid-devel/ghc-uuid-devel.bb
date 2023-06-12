SUMMARY = "Haskell uuid library development files"
DESCRIPTION = "This package provides the Haskell uuid library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-devel-1.3.15-4.3.aarch64.rpm"
RPM_HASH = "71e87938d6f50ad3133f872c70b075ae1b2000a895b5a2877d54970ac8a2419d42b0b4db31efffd132515303722902166e188332f04fbd51e7b41296aa892c6a"

RPROVIDES:${PN} += "ghc-devel(uuid-1.3.15-LYRljjihV0KIEewDtLdQ17) \
ghc-uuid-devel \
ghc-uuid-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(cryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV) \
ghc-devel(cryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb) \
ghc-devel(entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP) \
ghc-devel(network-info-0.2.1-G9nMDkAKQecAEHIupCmq9I) \
ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM) \
ghc-uuid"

inherit rpm
