SUMMARY = "A model for human colour/color perception"
DESCRIPTION = "This package provides a data type for colours and transparency. \
Colours can be blended and composed. Various colour spaces are supported. \
A module of colour names ('Data.Colour.Names') is provided."
LICENSE = "MIT"

PV = "2.3.6"

RPM_NAME = "ghc-colour-2.3.6-2.8.aarch64.rpm"
RPM_HASH = "e0e1d2aa855bae998a5d7ebcde7830d9478b74eabccbf49a460ff448a99b2d6826a09e517334ebe5ed039b7796685527428d947e971d2953e66be60897fbfbc0"

RPROVIDES:${PN} += "ghc-colour \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
