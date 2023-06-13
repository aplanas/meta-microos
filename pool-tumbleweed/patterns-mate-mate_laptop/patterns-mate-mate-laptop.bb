SUMMARY = "MATE Laptop"
DESCRIPTION = "MATE Tools designed specifically for use with laptop computers."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_laptop-20170319-5.3.aarch64.rpm"
RPM_HASH = "3dbbbf2b4084ed77fac6b64dc87288d0691cad3e6589bc6b988c0bc8e58e824afab850811df372c75b3f13924d926d148b5a3d023032b52c7b737341a51f8cdb"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-mate-mate_laptop \
patterns-mate-mate_laptop(aarch-64)"

RDEPENDS:${PN} += "pattern()"

inherit rpm
