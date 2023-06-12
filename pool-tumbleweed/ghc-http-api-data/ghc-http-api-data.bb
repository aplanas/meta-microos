SUMMARY = "Converting to/from HTTP API data like URL pieces, headers and query parameters"
DESCRIPTION = "This package defines typeclasses used for converting Haskell data types to and \
from HTTP API data. \
 \
Please see README.md."
LICENSE = "BSD-2-Clause"

PV = "0.5"

RPM_NAME = "ghc-http-api-data-0.5-3.2.aarch64.rpm"
RPM_HASH = "e9d56f6a418d36b159bc7db382c20bf51dec2a572ff4f8d2ed68f981ab971b9d50bcc064ee0b17021107bc1fd64c3ea159bfe2bf55e41a2ef6bf20c407cb5293"

RPROVIDES:${PN} += "ghc-http-api-data \
ghc-http-api-data(aarch-64) \
libHShttp-api-data-0.5-Ipkpz3wcjEIJthDto7snfd-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3-ghc9.4.5.so()(64bit) \
libHSattoparsec-0.14.4-JfIUPSNLtNQH9xUGOplWef-attoparsec-internal-ghc9.4.5.so()(64bit) \
libHSattoparsec-iso8601-1.1.0.0-2S5wwgpuLNfEy2BIFZOtUU-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov-ghc9.4.5.so()(64bit) \
libHSbase-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy-ghc9.4.5.so()(64bit) \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScase-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHScookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE-ghc9.4.5.so()(64bit) \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHShttp-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6-ghc9.4.5.so()(64bit) \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so()(64bit) \
libHSscientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1-ghc9.4.5.so()(64bit) \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStime-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libHSuuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
