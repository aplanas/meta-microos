SUMMARY = "A model for human colour/color perception"
DESCRIPTION = "This package provides a data type for colours and transparency. \
Colours can be blended and composed. Various colour spaces are supported. \
A module of colour names ('Data.Colour.Names') is provided."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-2.3.6-2.3.aarch64.rpm"
RPM_HASH = "441c20c19553d464fdc9c14083f833a8f6f3cabd3bdb574d9f5b112d6dd19d4bfee922756f4862d873137af2e611a88bd0c3442d277877bb0ffec414b1f12dba"

RPROVIDES:${PN} += "ghc-colour \
ghc-colour(aarch-64) \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
