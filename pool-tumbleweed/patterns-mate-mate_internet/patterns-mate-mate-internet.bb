SUMMARY = "MATE Internet"
DESCRIPTION = "MATE Internet Applications."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_internet-20170319-5.3.aarch64.rpm"
RPM_HASH = "c798e7465e98f656238408eae86ca8358333409be467eeef4df368d61961048587d8c26f3a94dc77f91e9c6e233d50a5bdfdfe33fab5298e8989120478d47161"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-mate-mate_internet \
patterns-mate-mate_internet(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
