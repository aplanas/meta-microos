SUMMARY = "MATE Administration Tools"
DESCRIPTION = "Administration Tools e.g. for desktop lockdown."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_admin-20170319-5.3.aarch64.rpm"
RPM_HASH = "f00a3dcd2ace5558166e73dca4aa5ed1a0633e054978039f0159b76e616ed655d0199e36ec531a0bdacb8752feda5a4b736009f046f3dcd499efc8b123bff931"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-mate-mate_admin \
patterns-mate-mate_admin(aarch-64)"

RDEPENDS:${PN} += "pattern()"

inherit rpm
