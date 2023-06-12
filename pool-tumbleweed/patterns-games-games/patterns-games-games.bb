SUMMARY = "Games"
DESCRIPTION = "A collection of games."
LICENSE = "MIT"

PV = "20220126"

RPM_NAME = "patterns-games-games-20220126-1.5.aarch64.rpm"
RPM_HASH = "0691cddbe0d8ebdd771f50dc4655a9d3cec34e1b9d3579299c84e1e7ceca148898a91078229fc0f5a9c4350a7f317c4d7606df9d81d0afd5ef0e78839cb9950f"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-games-games \
patterns-games-games(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
