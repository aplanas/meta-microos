SUMMARY = "A model for human colour/color perception"
DESCRIPTION = "This package provides a data type for colours and transparency. \
Colours can be blended and composed. Various colour spaces are supported. \
A module of colour names ('Data.Colour.Names') is provided."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-2.3.6-2.6.aarch64.rpm"
RPM_HASH = "b513d7f8be5bee36ec448dc7721024ce9f481d13d2bf1644daf28e72d04f35cb7e6ab5153b812a1198f7565651be98d5da2ed8aeb070b0edc08775c0d73584c3"

RPROVIDES:${PN} += "ghc-colour \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
