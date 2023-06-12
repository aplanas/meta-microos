SUMMARY = "MATE Office"
DESCRIPTION = "MATE Office"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_office-20170319-5.3.aarch64.rpm"
RPM_HASH = "8ed5248a15dba648774413d5b246f04ede93b6b14428dab1bbfadad288af0f99eee8b372535d066730c524429a64fd8974ac68fa9a6bc6bce62eda1053578d23"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-mate-mate_office \
patterns-mate-mate_office(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
