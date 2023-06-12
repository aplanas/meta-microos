SUMMARY = "XFCE Office"
DESCRIPTION = "XFCE Office"
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_office-20230212-2.1.aarch64.rpm"
RPM_HASH = "706c8eda2674171914a2a1689d24bee3e6c5cda6a4482280c18a46352be23593071d444db321c81fd1a27eb0d516506f444b7face7ef850c352452d3f6001511"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-openSUSE-xfce_office \
patterns-xfce-xfce_office \
patterns-xfce-xfce_office(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
