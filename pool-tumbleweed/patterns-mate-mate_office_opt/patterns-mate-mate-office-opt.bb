SUMMARY = "MATE Office"
DESCRIPTION = "MATE Office"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_office_opt-20170319-5.3.aarch64.rpm"
RPM_HASH = "76fcdb1607d81d15bc79d5519223aa7f9943d176b9c78a9d4b889cee03e24d33cd4046a5fa81ea996a8ca04fa61de19c2256a423ee63bc6bc425ba2998187f5a"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-mate-mate-office-opt"

RDEPENDS:${PN} += "pattern-"

inherit rpm
