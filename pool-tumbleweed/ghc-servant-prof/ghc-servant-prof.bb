SUMMARY = "Haskell servant profiling library"
DESCRIPTION = "This package provides the Haskell servant profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-prof-0.19.1-2.3.aarch64.rpm"
RPM_HASH = "98e6fbd9767ebe76c2fe1918e78254fe90cab576bb5dd057f3e7c6d1180302203d02fe34fd5acb5e77304bf1929945ad8b95a65ae97e992410f6b20100356dee"

RPROVIDES:${PN} += "ghc-prof(servant-0.19.1-CkczWd9pQYqHxItHfQRhzE) \
ghc-servant-prof \
ghc-servant-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6) \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) \
ghc-prof(bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-prof(constraints-0.13.4-8c0InBhz3htJzug27IqVE7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(http-api-data-0.5-Ipkpz3wcjEIJthDto7snfd) \
ghc-prof(http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU) \
ghc-prof(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-prof(mmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC) \
ghc-prof(mtl-2.2.2) \
ghc-prof(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) \
ghc-prof(singleton-bool-0.1.6-9MbEj8pBx4EB1jZ66FdPc4) \
ghc-prof(sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe) \
ghc-prof(string-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-prof(text-2.0.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) \
ghc-servant-devel"

inherit rpm
